.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$recognition$1$doInBackground$1;
.super Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager$recognition$1;->doInBackground()Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$recognition$1$doInBackground$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2515:1\n39#2,3:2516\n42#2:2522\n44#2,2:2524\n31#2,2:2526\n1563#3:2519\n1634#3,2:2520\n1636#3:2523\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$recognition$1$doInBackground$1\n*L\n1305#1:2516,3\n1305#1:2522\n1305#1:2524,2\n1309#1:2526,2\n1305#1:2519\n1305#1:2520,2\n1305#1:2523\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$recognition$1$doInBackground$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2515:1\n39#2,3:2516\n42#2:2522\n44#2,2:2524\n31#2,2:2526\n1563#3:2519\n1634#3,2:2520\n1636#3:2523\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager$recognition$1$doInBackground$1\n*L\n1305#1:2516,3\n1305#1:2522\n1305#1:2524,2\n1309#1:2526,2\n1305#1:2519\n1305#1:2520,2\n1305#1:2523\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager onFailure -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const v0, 0x7f141286

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    return-void
.end method

.method public onMessage(Lcom/baidu/ai/speech/realtime/full/download/Result;)V
    .locals 26

    const-string v0, "_list"

    const-class v1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    const-string v2, "result"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v3}, Lcom/baidu/ai/speech/realtime/full/download/Result;->getOrignalJsonStr()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AIManager VoiceManager onMessage -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setSpeechRecRunning(Z)V

    invoke-virtual {v3}, Lcom/baidu/ai/speech/realtime/full/download/Result;->isError()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v3}, Lcom/baidu/ai/speech/realtime/full/download/Result;->isFin()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lcom/baidu/ai/speech/realtime/full/download/Result;->getResult()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v2, v6}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendMsg(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceWatchface()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v2, v6}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendMsg(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    sget-object v5, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->XiOIii1(Lcom/sma/smartv3/biz/AIWatchFaceManager;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$isAiTaskRunning$p()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-static {}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$getMApp$p()Landroid/app/Application;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "mApp"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v4, v0

    :goto_0
    const v0, 0x7f14130b

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    return-void

    :cond_3
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setSpeechRecRunning(Z)V

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v2, v6}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendMsg(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v7, v5, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v3

    :cond_4
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const-string v5, "SEND_VOICE_START_AUTO_REFRESH"

    const/4 v15, 0x2

    invoke-static {v3, v5, v4, v15, v4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    new-instance v5, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    const/16 v13, 0x73

    const/4 v14, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v14}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v9

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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

    move-object/from16 v5, v16

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SEND_VOICE"

    invoke-static {v3, v0, v4, v15, v4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager onMessage -> start query: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Lcom/sma/smartv3/biz/voice/VoiceManager;->voiceQuery(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    const v0, 0x7f141286

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method
