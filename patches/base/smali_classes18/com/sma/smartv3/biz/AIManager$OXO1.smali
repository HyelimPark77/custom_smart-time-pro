.class public final Lcom/sma/smartv3/biz/AIManager$OXO1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AIManager;->X1IX(Ljava/lang/String;Lcom/sma/smartv3/model/AIFunctionType;I)V
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
    value = "SMAP\nAIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,801:1\n106#2:802\n78#2,22:803\n*S KotlinDebug\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n*L\n654#1:802\n654#1:803,22\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,801:1\n106#2:802\n78#2,22:803\n*S KotlinDebug\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n*L\n654#1:802\n654#1:803,22\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:I

.field public final synthetic IO:Ljava/lang/String;

.field public final synthetic iX1O1:Lcom/sma/smartv3/model/AIFunctionType;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/sma/smartv3/model/AIFunctionType;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/AIManager$OXO1;->IO:Ljava/lang/String;

    iput p2, p0, Lcom/sma/smartv3/biz/AIManager$OXO1;->I1:I

    iput-object p3, p0, Lcom/sma/smartv3/biz/AIManager$OXO1;->iX1O1:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/AIManager$OXO1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 25

    move-object/from16 v1, p0

    .line 2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v1, Lcom/sma/smartv3/biz/AIManager$OXO1;->IO:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AIManager openAiChatCompletion -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 3
    const-string v2, "https://api.openai.com/v1/chat/completions"

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    .line 4
    const-string v3, "application/json"

    invoke-virtual {v2, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setContentType(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    .line 5
    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->iIiiO()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Bearer "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Authorization"

    invoke-virtual {v2, v5, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    .line 6
    sget-object v5, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    iget-object v6, v1, Lcom/sma/smartv3/biz/AIManager$OXO1;->IO:Ljava/lang/String;

    iget v8, v1, Lcom/sma/smartv3/biz/AIManager$OXO1;->I1:I

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lcom/sma/smartv3/biz/AIManager;->OiIIX101O(Lcom/sma/smartv3/biz/AIManager;Ljava/lang/String;ZIILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string v6, "getBytes(...)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addByteBody([B)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    .line 7
    sget-object v3, Lcom/androidnetworking/common/Priority;->LOW:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v2, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    .line 8
    const-string v3, "openAiChatCompletion"

    invoke-virtual {v2, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v2

    .line 10
    invoke-virtual {v2}, Lcom/androidnetworking/common/ANRequest;->executeForOkHttpResponse()Lcom/androidnetworking/common/ANResponse;

    move-result-object v2

    iget-object v7, v1, Lcom/sma/smartv3/biz/AIManager$OXO1;->iX1O1:Lcom/sma/smartv3/model/AIFunctionType;

    const/4 v3, 0x0

    const/4 v14, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v2}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lokhttp3/Response;->code()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_b

    :cond_0
    move-object v6, v14

    .line 12
    :goto_0
    invoke-virtual {v2}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v14

    :goto_1
    if-nez v6, :cond_2

    goto/16 :goto_9

    .line 13
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/16 v9, 0xc8

    if-ne v8, v9, :cond_f

    .line 14
    new-instance v0, Ljava/io/BufferedReader;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lokhttp3/ResponseBody;->charStream()Ljava/io/Reader;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v14

    :goto_2
    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 15
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 16
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object v6, v14

    :goto_3
    if-eqz v2, :cond_15

    .line 17
    sget-object v8, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 18
    const-string v8, "data:"

    const/4 v9, 0x2

    invoke-static {v2, v8, v3, v9, v14}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/4 v6, 0x5

    .line 19
    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v6, "substring(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v6

    const/4 v8, 0x1

    sub-int/2addr v6, v8

    move v9, v3

    move v10, v9

    :goto_4
    if-gt v9, v6, :cond_9

    if-nez v10, :cond_4

    move v11, v9

    goto :goto_5

    :cond_4
    move v11, v6

    .line 21
    :goto_5
    invoke-interface {v2, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    const/16 v12, 0x20

    .line 22
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->iIiiO(II)I

    move-result v11

    if-gtz v11, :cond_5

    move v11, v8

    goto :goto_6

    :cond_5
    move v11, v3

    :goto_6
    if-nez v10, :cond_7

    if-nez v11, :cond_6

    move v10, v8

    goto :goto_4

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_7
    if-nez v11, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 v6, v6, -0x1

    goto :goto_4

    :cond_9
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 23
    invoke-interface {v2, v9, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 25
    new-instance v6, Lcom/sma/smartv3/biz/ai/SSE;

    invoke-direct {v6, v2}, Lcom/sma/smartv3/biz/ai/SSE;-><init>(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 26
    :cond_a
    const-string v8, ""

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz v6, :cond_e

    .line 27
    invoke-virtual {v6}, Lcom/sma/smartv3/biz/ai/SSE;->isDone()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v15, "toString(...)"

    if-eqz v2, :cond_c

    .line 28
    :try_start_1
    new-instance v6, Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x18

    const/4 v13, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-interface {v2, v6}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    .line 30
    :cond_b
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iX1O1()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 31
    sget-object v16, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v22, "openAiChatCompletion"

    const/16 v23, 0x1e

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v16 .. v24}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_c

    .line 32
    :cond_c
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/ai/SSE;->getData()Ljava/lang/String;

    move-result-object v6

    const-class v8, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionResult;

    invoke-virtual {v2, v6, v8}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionResult;

    .line 33
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionResult;->getChoices()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->getDelta()Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    new-instance v6, Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x18

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    sget-object v2, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-interface {v2, v6}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_d
    move-object v6, v14

    .line 36
    :cond_e
    :goto_8
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    :cond_f
    :goto_9
    if-eqz v2, :cond_10

    .line 37
    invoke-virtual {v2}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    :cond_10
    move-object v2, v14

    .line 38
    :goto_a
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 39
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-class v4, Lcom/sma/smartv3/biz/ai/AIBase;

    invoke-static {v2, v4}, Lcom/sma/smartv3/util/UtilsKt;->iOOX010X(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/biz/ai/AIBase;

    if-eqz v4, :cond_11

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/ai/AIBase;->getError()Lcom/sma/smartv3/biz/ai/AIError;

    move-result-object v4

    if-nez v4, :cond_12

    :cond_11
    new-instance v7, Lcom/sma/smartv3/biz/ai/AIError;

    .line 40
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 41
    invoke-direct/range {v7 .. v13}, Lcom/sma/smartv3/biz/ai/AIError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v7

    .line 42
    :cond_12
    invoke-virtual {v5, v4}, Lcom/sma/smartv3/biz/AIManager;->O1O(Lcom/sma/smartv3/biz/ai/AIError;)V

    .line 43
    invoke-virtual {v5}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/ai/AIError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    .line 44
    :cond_13
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AIManager openAiChatCompletion -> code:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", error:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_c

    .line 45
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    instance-of v2, v0, Ljava/io/InterruptedIOException;

    if-nez v2, :cond_14

    const v2, 0x7f141196

    .line 47
    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    sget-object v2, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    .line 49
    :cond_14
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AIManager openAiChatCompletion -> error:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_15
    :goto_c
    return-object v14
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/AIManager$OXO1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
