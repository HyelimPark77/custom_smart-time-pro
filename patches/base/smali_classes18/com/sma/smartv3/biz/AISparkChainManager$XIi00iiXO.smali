.class public final Lcom/sma/smartv3/biz/AISparkChainManager$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/LLMCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/AISparkChainManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAISparkChainManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISparkChainManager.kt\ncom/sma/smartv3/biz/AISparkChainManager$llmCallbacks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,979:1\n1#2:980\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAISparkChainManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISparkChainManager.kt\ncom/sma/smartv3/biz/AISparkChainManager$llmCallbacks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,979:1\n1#2:980\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLLMError(Lcom/iflytek/sparkchain/core/LLMError;Ljava/lang/Object;)V
    .locals 4

    const-string p2, "error"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMError;->getErrCode()I

    move-result v1

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMError;->getErrMsg()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onLLMError event = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  msg = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMError;->getErrCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iO(Z)V

    return-void
.end method

.method public onLLMEvent(Lcom/iflytek/sparkchain/core/LLMEvent;Ljava/lang/Object;)V
    .locals 4

    const-string p2, "event"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMEvent;->getEventID()I

    move-result v1

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMEvent;->getEventMsg()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onLLMEvent event = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " msg = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMEvent;->getEventMsg()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getEventMsg(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iO(Z)V

    return-void
.end method

.method public onLLMResult(Lcom/iflytek/sparkchain/core/LLMResult;Ljava/lang/Object;)V
    .locals 13

    const-string v0, "llmResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->XIi00iiXO()I

    move-result v2

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getContent()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getStatus()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onLLMResult usrContext = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "  token = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "   content = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", status = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->XIi00iiXO()I

    move-result v0

    instance-of v1, p2, Ljava/lang/Integer;

    if-nez v1, :cond_0

    goto/16 :goto_9

    :cond_0
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-ne v0, p2, :cond_12

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getStatus()I

    move-result p2

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    if-ne p2, v3, :cond_3

    :goto_0
    sget-object v1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOOX010X()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/biz/AISparkChainManager;->IiiXiI0I(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IIX1OXO()Ljava/lang/StringBuffer;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v4, Lcom/sma/smartv3/model/AIAnswer;

    sget-object v5, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOOX010X()Ljava/lang/String;

    move-result-object v6

    if-ne p2, v3, :cond_2

    move v7, v2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    move v7, v1

    :goto_1
    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getContent()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onLLMResult  status = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  content = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AISparkChainPlay  pronounist  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v0

    const-string v4, "cn"

    const-string v5, "id"

    const-string v6, "in"

    const-string v7, "zh"

    if-eqz v0, :cond_9

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v8, 0xc6b

    if-eq v0, v8, :cond_7

    const/16 v4, 0xd25

    if-eq v0, v4, :cond_5

    const/16 v4, 0xf2e

    if-eq v0, v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    move-object v1, v5

    goto :goto_3

    :cond_7
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "zh-Hans"

    goto :goto_3

    :cond_9
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_2

    :cond_a
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    move-object v1, v4

    :cond_b
    :goto_3
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_4

    :cond_d
    const/4 v4, 0x0

    :goto_4
    check-cast v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_e

    goto :goto_6

    :cond_e
    :goto_5
    move-object v9, v0

    goto :goto_7

    :cond_f
    :goto_6
    const-string v0, "x4_enus_catherine_profnews"

    goto :goto_5

    :goto_7
    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->XXIIO1i11()Z

    move-result v1

    if-eqz v1, :cond_11

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    if-eqz v1, :cond_10

    if-ne p2, v3, :cond_11

    sget-object v4, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOOX010X()Ljava/lang/String;

    move-result-object v5

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v10, "onLLMResult"

    invoke-static/range {v4 .. v12}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_8

    :cond_10
    invoke-virtual {v0, p2, v9}, Lcom/sma/smartv3/biz/AISparkChainManager;->iI(ILjava/lang/String;)V

    :cond_11
    :goto_8
    if-ne p2, v3, :cond_12

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getCompletionTokens()I

    move-result p2

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getPromptTokens()I

    move-result v0

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getTotalTokens()I

    move-result p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " completionTokens: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " promptTokens: "

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " totalTokens: "

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/sma/smartv3/biz/AISparkChainManager;->iO(Z)V

    :cond_12
    :goto_9
    return-void
.end method
