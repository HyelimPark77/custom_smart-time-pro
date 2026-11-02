.class final Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->changeRecordStatus()Lkotlinx/coroutines/XiOIO;
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$changeRecordStatus$1"
    f = "SparkChainTranslateViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
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
            "Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance p1, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$getUseCase$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->X0O()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$getTAG$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Ljava/lang/String;

    move-result-object v1

    xor-int/lit8 v2, p1, 0x1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " changeRecordStatus isStartRecord:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_leftLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$getUseCase$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->I1()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
