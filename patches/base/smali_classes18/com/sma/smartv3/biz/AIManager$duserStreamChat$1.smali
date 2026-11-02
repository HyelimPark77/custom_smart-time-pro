.class public final Lcom/sma/smartv3/biz/AIManager$duserStreamChat$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AIManager;->I0IIOi(Ljava/lang/String;Lcom/sma/smartv3/model/AIFunctionType;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/model/AIFunctionType;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AIFunctionType;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/AIManager$duserStreamChat$1;->OXO1:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lkotlin/jvm/internal/Ref$ObjectRef;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/AIManager$duserStreamChat$1;->iO(Lkotlin/jvm/internal/Ref$ObjectRef;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final iO(Lkotlin/jvm/internal/Ref$ObjectRef;Z)Lkotlin/Unit;
    .locals 2

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoicePlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoicePlayer;

    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p0, v1, v0, v1}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->play$default(Lcom/sma/smartv3/biz/voice/VoicePlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public XIi00iiXO(Ljava/lang/String;)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AIManager duserStreamChat line -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const-string v4, ""

    iput-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v5, "type"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "ended"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    const-string v6, "response"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, "data"

    const/4 v15, 0x1

    if-eqz v6, :cond_2

    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/sma/smartv3/biz/dcs/ResponseData;

    invoke-virtual {v0, v3, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/dcs/ResponseData;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/ResponseData;->getAnswer()Ljava/lang/String;

    move-result-object v17

    new-instance v7, Lcom/sma/smartv3/model/AIAnswer;

    iget-object v8, v1, Lcom/sma/smartv3/biz/AIManager$duserStreamChat$1;->OXO1:Lcom/sma/smartv3/model/AIFunctionType;

    const/16 v13, 0x18

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, v17

    invoke-direct/range {v7 .. v14}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3, v7}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :goto_0
    if-ne v10, v15, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iX1O1()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v16, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiX()Z

    move-result v19

    const-string v22, "duserStreamChat"

    const/16 v23, 0x1a

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->OiX()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iX1O1()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->IXXOO()I

    move-result v5

    if-le v4, v5, :cond_a

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->IXXOO()I

    move-result v4

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->IXXOO()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/biz/AIManager;->i11I(I)V

    sget-object v16, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->OiX()Z

    move-result v19

    const-string v22, "duserStreamChat2"

    const/16 v23, 0x1a

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_2
    const-string v6, "dcs"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    const-class v6, Lcom/sma/smartv3/biz/dcs/DcsData;

    invoke-virtual {v5, v4, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/biz/dcs/DcsData;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AIManager duserStreamChat dcsData -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/dcs/DcsData;->getTts()Lcom/sma/smartv3/biz/dcs/DcsTts;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/DcsTts;->getText()Ljava/lang/String;

    move-result-object v17

    new-instance v7, Lcom/sma/smartv3/model/AIAnswer;

    iget-object v8, v1, Lcom/sma/smartv3/biz/AIManager$duserStreamChat$1;->OXO1:Lcom/sma/smartv3/model/AIFunctionType;

    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    const/16 v13, 0x10

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, v17

    invoke-direct/range {v7 .. v14}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-interface {v5, v7}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_3
    if-eq v10, v15, :cond_4

    sget-object v5, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/q62;->OiX()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->IXXOO()I

    move-result v6

    if-le v5, v6, :cond_a

    :cond_4
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->IXXOO()I

    move-result v5

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->IXXOO()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v0, v5}, Lcom/sma/smartv3/biz/AIManager;->i11I(I)V

    sget-object v5, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v5, v15}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setDisableStreamLog(Z)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iX1O1()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/dcs/DcsData;->getDcs()Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/dcs/DcsStruct;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/DcsStruct;->getDirective()Lcom/sma/smartv3/biz/dcs/Directive;

    move-result-object v0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/Directive;->getHeader()Lcom/sma/smartv3/biz/dcs/Header;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/dcs/Header;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Play"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/Directive;->getPayload()Lcom/sma/smartv3/biz/dcs/PlayPayload;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/PlayPayload;->getAudioItem()Lcom/sma/smartv3/biz/dcs/AudioItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/AudioItem;->getStream()Lcom/sma/smartv3/biz/dcs/Stream;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/Stream;->getUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v16, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiX()Z

    move-result v19

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I11X11OX;

    invoke-direct {v0, v3}, Lcom/android/mltcode/paycertificationapi/I11X11OX;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    const-string v22, "dcs1"

    const/16 v23, 0x12

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    move-object/from16 v20, v0

    invoke-static/range {v16 .. v24}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_6
    sget-object v16, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiX()Z

    move-result v19

    const-string v22, "dcs2"

    const/16 v23, 0x1a

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_7
    sget-object v16, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiX()Z

    move-result v19

    const-string v22, "dcs3"

    const/16 v23, 0x1a

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    if-nez v2, :cond_8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "AIManager duserStreamChat -> error: empty"

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v2, "null"

    invoke-interface {v0, v2}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-interface {v0, v2}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_9
    :goto_3
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    :cond_a
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iX1O1()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIManager duserStreamChat -> error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/AIManager$duserStreamChat$1;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method
