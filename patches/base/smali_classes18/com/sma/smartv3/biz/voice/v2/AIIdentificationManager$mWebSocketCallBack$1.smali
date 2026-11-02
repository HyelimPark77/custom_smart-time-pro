.class public final Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final answer:Ljava/lang/StringBuilder;

.field private index:I

.field private lastSendTime:J

.field private mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->lastSendTime:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->answer:Ljava/lang/StringBuilder;

    new-instance v1, Lcom/sma/smartv3/model/AIAnswer;

    sget-object v2, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    const/16 v7, 0x1a

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    return-void
.end method

.method private final handMessage(Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 12

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AIChat handleResponse -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    iget v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->index:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->index:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getEnded()I

    move-result v0

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v2, "getBytes(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    sget-object v2, Lcom/szabh/smable3/entity/BleVoice;->Companion:Lcom/szabh/smable3/entity/BleVoice$Companion;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleVoice$Companion;->getCONTENT_MAX_LENGTH()I

    move-result v2

    if-ge v0, v2, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->lastSendTime:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x258

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OXOI0XII()Z

    move-result v2

    if-eqz v2, :cond_1

    const v2, 0x7f1400cb

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v9, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getVoiceMode()I

    move-result v5

    new-instance v2, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v10, 0xa

    const/4 v11, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setDisableStreamLog(Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->lastSendTime:J

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onProcessComplete(Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final getAnswer()Ljava/lang/StringBuilder;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->answer:Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public final getMAIAnswer()Lcom/sma/smartv3/model/AIAnswer;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    return-object v0
.end method

.method public onEmotion(Ljava/lang/String;)V
    .locals 11

    const-string v0, "emotion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Xi1XO00()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getVoiceMode()I

    move-result v4

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/xp5;->XO0O10(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;

    move-result-object v5

    new-instance v1, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v9, 0x22

    const/4 v10, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    :cond_0
    return-void
.end method

.method public onSttText(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onSttText  text = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , isFinal = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, "  "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onComplete(Ljava/lang/String;)V

    :cond_0
    sget-object p2, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onTtsStart()V
    .locals 20

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->RECORD_PACKET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v3, Lcom/szabh/smable3/entity/BleRecordPacket;

    const/16 v18, 0x3fff

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v19}, Lcom/szabh/smable3/entity/BleRecordPacket;-><init>(IIIIIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x6

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BleRecordPacket;->setMStatus(I)V

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public onTtsStop()V
    .locals 20

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->RECORD_PACKET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v3, Lcom/szabh/smable3/entity/BleRecordPacket;

    const/16 v18, 0x3fff

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v19}, Lcom/szabh/smable3/entity/BleRecordPacket;-><init>(IIIIIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x7

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BleRecordPacket;->setMStatus(I)V

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public onTtsText(Ljava/lang/String;Z)V
    .locals 8

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onTtsText  text = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , isFinal = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->answer:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AIAnswer;->setEnded(I)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->answer:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->answer:Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "..."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AIAnswer;->setText(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->handMessage(Lcom/sma/smartv3/model/AIAnswer;)V

    if-eqz p2, :cond_1

    new-instance v0, Lcom/sma/smartv3/model/AIAnswer;

    sget-object v1, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    const/16 v6, 0x1a

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->answer:Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/ke5;->XO0X10iO(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->index:I

    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getAIModelCallback()Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onComplete(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getAIModelCallback()Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onProcessComplete(Ljava/lang/String;)V

    :goto_1
    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    iget-object p2, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setMAIAnswer(Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;->mAIAnswer:Lcom/sma/smartv3/model/AIAnswer;

    return-void
.end method
