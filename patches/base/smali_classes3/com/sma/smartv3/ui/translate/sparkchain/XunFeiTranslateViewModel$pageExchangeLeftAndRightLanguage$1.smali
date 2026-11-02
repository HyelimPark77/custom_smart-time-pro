.class final Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageExchangeLeftAndRightLanguage()Lkotlinx/coroutines/XiOIO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n85#2,3:171\n85#2,3:174\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n*L\n120#1:171,3\n121#1:174,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1"
    f = "SparkChainTranslateViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x77
    }
    m = "invokeSuspend"
    n = {
        "mCacheLanguage"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n85#2,3:171\n85#2,3:174\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n*L\n120#1:171,3\n121#1:174,3\n*E\n"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->invokeSuspend$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_rightLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMTranslateLanguage(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_leftLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p0

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMTranslateToLanguage(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_leftLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_leftLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v3}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_rightLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v3

    invoke-interface {v3}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_rightLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$getUseCase$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    new-instance v4, Lcom/sma/smartv3/ui/translate/sparkchain/IiI10X;

    invoke-direct {v4, v3}, Lcom/sma/smartv3/ui/translate/sparkchain/IiI10X;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)V

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->label:I

    invoke-virtual {v1, v4, p0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->iOOX010X(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_leftLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v1

    invoke-interface {v1}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AI_TRANSLATION_LEFT_LANGUAGE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    invoke-virtual {v0, v2, v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_rightLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AI_TRANSLATION_RIGHT_LANGUAGE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
