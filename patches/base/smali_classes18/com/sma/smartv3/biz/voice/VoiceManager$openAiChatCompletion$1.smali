.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiChatCompletion(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2515:1\n106#2:2516\n78#2,22:2517\n39#3,3:2539\n42#3:2545\n44#3,2:2547\n31#3,2:2549\n39#3,3:2551\n42#3:2557\n44#3,2:2559\n31#3,2:2561\n1563#4:2542\n1634#4,2:2543\n1636#4:2546\n1563#4:2554\n1634#4,2:2555\n1636#4:2558\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1\n*L\n1699#1:2516\n1699#1:2517,22\n1712#1:2539,3\n1712#1:2545\n1712#1:2547,2\n1717#1:2549,2\n1742#1:2551,3\n1742#1:2557\n1742#1:2559,2\n1746#1:2561,2\n1712#1:2542\n1712#1:2543,2\n1712#1:2546\n1742#1:2554\n1742#1:2555,2\n1742#1:2558\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2515:1\n106#2:2516\n78#2,22:2517\n39#3,3:2539\n42#3:2545\n44#3,2:2547\n31#3,2:2549\n39#3,3:2551\n42#3:2557\n44#3,2:2559\n31#3,2:2561\n1563#4:2542\n1634#4,2:2543\n1636#4:2546\n1563#4:2554\n1634#4,2:2555\n1636#4:2558\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1\n*L\n1699#1:2516\n1699#1:2517,22\n1712#1:2539,3\n1712#1:2545\n1712#1:2547,2\n1717#1:2549,2\n1742#1:2551,3\n1742#1:2557\n1742#1:2559,2\n1746#1:2561,2\n1712#1:2542\n1712#1:2543,2\n1712#1:2546\n1742#1:2554\n1742#1:2555,2\n1742#1:2558\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $query:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;->$query:Ljava/lang/String;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 29

    move-object/from16 v1, p0

    .line 2
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v2, 0x1

    invoke-static {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$setAiTaskRunning$p(Z)V

    .line 3
    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v4, v1, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;->$query:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AIManager VoiceManager openAiChatCompletion -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 4
    const-string v4, "https://api.openai.com/v1/chat/completions"

    invoke-static {v4}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    .line 5
    const-string v5, "application/json"

    invoke-virtual {v4, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setContentType(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    .line 6
    sget-object v5, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/q62;->iIiiO()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Bearer "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "Authorization"

    invoke-virtual {v4, v7, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    .line 7
    sget-object v7, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    iget-object v8, v1, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;->$query:Ljava/lang/String;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x96

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/biz/AIManager;->OiIIX101O(Lcom/sma/smartv3/biz/AIManager;Ljava/lang/String;ZIILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    const-string v8, "getBytes(...)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addByteBody([B)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    .line 8
    sget-object v5, Lcom/androidnetworking/common/Priority;->LOW:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v4, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    .line 9
    const-string v5, "openAiChatCompletion"

    invoke-virtual {v4, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v4

    .line 10
    invoke-virtual {v4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v4

    .line 11
    invoke-virtual {v4}, Lcom/androidnetworking/common/ANRequest;->executeForOkHttpResponse()Lcom/androidnetworking/common/ANResponse;

    move-result-object v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 12
    :try_start_0
    invoke-virtual {v4}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v11

    if-eqz v11, :cond_0

    invoke-virtual {v11}, Lokhttp3/Response;->code()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_0

    :catch_0
    move-exception v0

    const v16, 0x7f14107a

    goto/16 :goto_d

    :cond_0
    move-object v11, v10

    .line 13
    :goto_0
    invoke-virtual {v4}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v10

    :goto_1
    if-nez v11, :cond_3

    :cond_2
    const v16, 0x7f14107a

    goto/16 :goto_b

    .line 14
    :cond_3
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const/16 v13, 0xc8

    if-ne v12, v13, :cond_2

    .line 15
    new-instance v0, Ljava/io/BufferedReader;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lokhttp3/ResponseBody;->charStream()Ljava/io/Reader;

    move-result-object v3

    goto :goto_2

    :cond_4
    move-object v3, v10

    :goto_2
    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 16
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .line 17
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    move-object v7, v10

    :goto_3
    if-eqz v3, :cond_18

    .line 19
    sget-object v13, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 20
    const-string v13, "data:"

    const/4 v14, 0x2

    invoke-static {v3, v13, v9, v14, v10}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/4 v7, 0x5

    .line 21
    invoke-virtual {v3, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v7, "substring(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v7

    sub-int/2addr v7, v2

    move v13, v9

    move v14, v13

    :goto_4
    if-gt v13, v7, :cond_a

    if-nez v14, :cond_5

    move v15, v13

    goto :goto_5

    :cond_5
    move v15, v7

    .line 23
    :goto_5
    invoke-interface {v3, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v16, 0x7f14107a

    const/16 v5, 0x20

    .line 24
    :try_start_1
    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->iIiiO(II)I

    move-result v5

    if-gtz v5, :cond_6

    move v5, v2

    goto :goto_6

    :cond_6
    move v5, v9

    :goto_6
    if-nez v14, :cond_8

    if-nez v5, :cond_7

    move v14, v2

    goto :goto_4

    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_8
    if-nez v5, :cond_9

    goto :goto_7

    :cond_9
    add-int/lit8 v7, v7, -0x1

    goto :goto_4

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :cond_a
    const v16, 0x7f14107a

    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 25
    invoke-interface {v3, v13, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 27
    new-instance v7, Lcom/sma/smartv3/biz/ai/SSE;

    invoke-direct {v7, v3}, Lcom/sma/smartv3/biz/ai/SSE;-><init>(Ljava/lang/String;)V

    :cond_b
    move v9, v2

    goto/16 :goto_a

    :cond_c
    const v16, 0x7f14107a

    .line 28
    const-string v5, ""

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    if-eqz v7, :cond_b

    .line 29
    invoke-virtual {v7}, Lcom/sma/smartv3/biz/ai/SSE;->isDone()Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v5, "SEND_VOICE"

    const/16 v13, 0xa

    const-string v15, "_list"

    const-class v10, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    const-string v14, "toString(...)"

    if-eqz v3, :cond_f

    .line 30
    :try_start_2
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v23

    .line 32
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMVoiceMode()I

    move-result v21

    .line 34
    new-instance v18, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v26, 0xa

    const/16 v27, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v25, v3

    invoke-direct/range {v18 .. v27}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v18

    .line 35
    invoke-virtual {v0, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    .line 36
    sget-object v18, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v24, "openAiChatCompletion"

    const/16 v25, 0x1e

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v0

    invoke-static/range {v18 .. v26}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 37
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 38
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v0

    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 40
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v13}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 42
    check-cast v6, Lcom/google/gson/JsonElement;

    .line 43
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v7, v6, v10}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    .line 44
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_8

    .line 45
    :catch_2
    :try_start_4
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v3

    .line 46
    :cond_d
    check-cast v3, Ljava/util/Collection;

    .line 47
    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 48
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    .line 49
    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMStatus()I

    move-result v6

    if-ne v6, v2, :cond_e

    .line 50
    invoke-virtual {v3, v9}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMStatus(I)V

    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMContent(Ljava/lang/String;)V

    .line 52
    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v5, v2, v3, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 55
    :cond_e
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-static {v9}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$setAiTaskRunning$p(Z)V

    goto/16 :goto_e

    .line 56
    :cond_f
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v7}, Lcom/sma/smartv3/biz/ai/SSE;->getData()Ljava/lang/String;

    move-result-object v7

    const-class v2, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionResult;

    invoke-virtual {v3, v7, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionResult;

    .line 57
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionResult;->getChoices()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->getDelta()Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v24

    .line 59
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMVoiceMode()I

    move-result v22

    .line 61
    new-instance v19, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v27, 0xa

    const/16 v28, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v26, v2

    invoke-direct/range {v19 .. v28}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v19

    .line 62
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v7

    sget-object v9, Lcom/szabh/smable3/entity/BleVoice;->Companion:Lcom/szabh/smable3/entity/BleVoice$Companion;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleVoice$Companion;->getCONTENT_MAX_LENGTH()I

    move-result v9

    if-ge v7, v9, :cond_10

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    sub-long v20, v20, v11

    const-wide/16 v11, 0x1f4

    cmp-long v7, v20, v11

    if-lez v7, :cond_10

    .line 64
    invoke-virtual {v3, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    .line 65
    :cond_10
    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 66
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v2

    .line 67
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 68
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v13}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 70
    check-cast v7, Lcom/google/gson/JsonElement;

    .line 71
    new-instance v9, Lcom/google/gson/Gson;

    invoke-direct {v9}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v9, v7, v10}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    .line 72
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_9

    .line 73
    :catch_3
    :try_start_6
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v3

    .line 74
    :cond_11
    check-cast v3, Ljava/util/Collection;

    .line 75
    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 76
    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    .line 77
    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMStatus()I

    move-result v7

    const/4 v9, 0x1

    if-ne v7, v9, :cond_12

    .line 78
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMContent(Ljava/lang/String;)V

    .line 79
    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    .line 80
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Lcom/google/gson/Gson;

    invoke-direct {v10}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v10, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v7, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v3, 0x0

    const/4 v7, 0x2

    invoke-static {v2, v5, v3, v7, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 82
    :cond_12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-wide v11, v2

    const/4 v7, 0x0

    .line 83
    :goto_a
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    move v2, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    goto/16 :goto_3

    :goto_b
    if-eqz v4, :cond_13

    .line 84
    invoke-virtual {v4}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v2

    goto :goto_c

    :cond_13
    const/4 v2, 0x0

    .line 85
    :goto_c
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_16

    .line 86
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-class v4, Lcom/sma/smartv3/biz/ai/AIBase;

    invoke-static {v2, v4}, Lcom/sma/smartv3/util/UtilsKt;->iOOX010X(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/biz/ai/AIBase;

    if-eqz v4, :cond_14

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/ai/AIBase;->getError()Lcom/sma/smartv3/biz/ai/AIError;

    move-result-object v4

    if-nez v4, :cond_15

    :cond_14
    new-instance v20, Lcom/sma/smartv3/biz/ai/AIError;

    .line 87
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 88
    invoke-direct/range {v20 .. v26}, Lcom/sma/smartv3/biz/ai/AIError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v20

    .line 89
    :cond_15
    invoke-virtual {v7, v4}, Lcom/sma/smartv3/biz/AIManager;->O1O(Lcom/sma/smartv3/biz/ai/AIError;)V

    .line 90
    :cond_16
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AIManager VoiceManager openAiChatCompletion -> code:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", error:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 91
    invoke-static/range {v16 .. v16}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_e

    .line 92
    :goto_d
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    instance-of v2, v0, Ljava/io/InterruptedIOException;

    if-nez v2, :cond_17

    .line 94
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-static/range {v16 .. v16}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    .line 96
    :cond_17
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AIManager VoiceManager openAiChatCompletion -> error:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 97
    :cond_18
    :goto_e
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/16 v19, 0x0

    invoke-static/range {v19 .. v19}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$setAiTaskRunning$p(Z)V

    const/16 v17, 0x0

    return-object v17
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
