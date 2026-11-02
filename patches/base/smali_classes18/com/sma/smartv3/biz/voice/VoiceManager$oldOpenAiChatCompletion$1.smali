.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager;->oldOpenAiChatCompletion()V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2515:1\n39#2,3:2516\n42#2:2522\n44#2,2:2524\n31#2,2:2526\n1563#3:2519\n1634#3,2:2520\n1636#3:2523\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1\n*L\n2299#1:2516,3\n2299#1:2522\n2299#1:2524,2\n2303#1:2526,2\n2299#1:2519\n2299#1:2520,2\n2299#1:2523\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2515:1\n39#2,3:2516\n42#2:2522\n44#2,2:2524\n31#2,2:2526\n1563#3:2519\n1634#3,2:2520\n1636#3:2523\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1\n*L\n2299#1:2516,3\n2299#1:2522\n2299#1:2524,2\n2303#1:2526,2\n2299#1:2519\n2299#1:2520,2\n2299#1:2523\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "invalid_request_error"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const v0, 0x7f140d2f

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const v0, 0x7f14107a

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 26

    move-object/from16 v1, p1

    .line 2
    const-string v10, "_list"

    const-class v11, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    if-eqz v1, :cond_2

    .line 3
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setSpeechRecRunning(Z)V

    .line 4
    invoke-static {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendMsg(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v2

    if-nez v2, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceWatchface()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    sget-object v0, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->XiOIii1(Lcom/sma/smartv3/biz/AIWatchFaceManager;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IILjava/lang/Object;)V

    goto/16 :goto_1

    .line 8
    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    .line 9
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 13
    check-cast v2, Lcom/google/gson/JsonElement;

    .line 14
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v2, v11}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    .line 15
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 16
    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v1

    .line 17
    :cond_1
    check-cast v1, Ljava/util/Collection;

    .line 18
    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v12

    .line 19
    sget-object v13, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const-string v0, "SEND_VOICE_START_AUTO_REFRESH"

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-static {v13, v0, v14, v15, v14}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    const/16 v8, 0x73

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v4

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    new-instance v16, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$getMAIMode$p()I

    move-result v23

    const/16 v24, 0x13

    const/16 v25, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x2

    const-string v20, ""

    const/16 v21, 0x0

    const/16 v22, 0x1

    invoke-direct/range {v16 .. v25}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v12}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const-string v0, "SEND_VOICE"

    invoke-static {v13, v0, v14, v15, v14}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 25
    invoke-virtual {v13, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiChatCompletion(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method
