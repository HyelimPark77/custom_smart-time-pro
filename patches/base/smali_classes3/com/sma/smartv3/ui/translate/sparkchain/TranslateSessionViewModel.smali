.class public final Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# instance fields
.field private final _resultFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;",
            ">;>;"
        }
    .end annotation
.end field

.field private final _stateFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/sma/smartv3/ui/ai_note/OXO1;",
            ">;"
        }
    .end annotation
.end field

.field private final repository:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final resultFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sessionList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final stateFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/ui/ai_note/OXO1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->repository:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->_resultFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->sessionList:Ljava/util/List;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->resultFlow:Lcom/android/mltcode/paycertificationapi/k85;

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/OXO1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai_note/OXO1$XIi00iiXO;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->_stateFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->stateFlow:Lcom/android/mltcode/paycertificationapi/k85;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->getSparkChainSessionList()Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public static final synthetic access$getRepository$p(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->repository:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;

    return-object p0
.end method

.method public static final synthetic access$getSessionList$p(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->sessionList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$get_resultFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->_resultFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static final synthetic access$get_stateFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->_stateFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method


# virtual methods
.method public final deleteAllSparkChainSessionList()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$deleteAllSparkChainSessionList$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$deleteAllSparkChainSessionList$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final getResultFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->resultFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final getSparkChainSessionList()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$getSparkChainSessionList$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel$getSparkChainSessionList$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final getStateFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/ui/ai_note/OXO1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionViewModel;->stateFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method
