.class public final Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final _audioPlayFlag:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _displayFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/android/mltcode/paycertificationapi/mq4;",
            ">;"
        }
    .end annotation
.end field

.field private final _leftLanguageFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field private final _rightLanguageFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field private final audioPlay:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final displayFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/android/mltcode/paycertificationapi/mq4;",
            ">;"
        }
    .end annotation
.end field

.field private final isRecording:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mLanguageTranslationList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field private final pageLeftLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field private final pageRightLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field private final recordingAndTranslatingFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final useCase:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)V
    .locals 12
    .param p1    # Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "useCase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->useCase:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    const-string v0, "XunFeiTranslateViewModel"

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->O10IXXX0X()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->mLanguageTranslationList:Ljava/util/List;

    new-instance v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const/16 v10, 0xfe

    const/4 v11, 0x0

    const-string v2, "\u4e2d\u6587"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->_leftLanguageFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageLeftLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;

    new-instance v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const-string v2, "\u4e2d\u6587"

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->_rightLanguageFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageRightLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->X0O()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->recordingAndTranslatingFlow:Lcom/android/mltcode/paycertificationapi/k85;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->iIiiO()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->isRecording:Lcom/android/mltcode/paycertificationapi/k85;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->_audioPlayFlag:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->audioPlay:Lcom/android/mltcode/paycertificationapi/k85;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mq4;

    const/16 v7, 0x3b

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "-10086"

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/android/mltcode/paycertificationapi/mq4;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->_displayFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->displayFlow:Lcom/android/mltcode/paycertificationapi/k85;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->languageUpdate()Lkotlinx/coroutines/XiOIO;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->initLanguages()Lkotlinx/coroutines/XiOIO;

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getUseCase$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->useCase:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    return-object p0
.end method

.method public static final synthetic access$get_displayFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->_displayFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static final synthetic access$get_leftLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->_leftLanguageFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static final synthetic access$get_rightLanguageFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->_rightLanguageFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method private final initLanguages()Lkotlinx/coroutines/XiOIO;
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$initLanguages$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$initLanguages$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic isEqualOtherLanguage$default(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/model/LanguageTranslationData;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->isEqualOtherLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic pageLanguageSideUpdate$default(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/model/LanguageTranslationData;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageLanguageSideUpdate(Lcom/sma/smartv3/model/LanguageTranslationData;I)V

    return-void
.end method


# virtual methods
.method public final changeRecordStatus()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$changeRecordStatus$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final getAudioPlay()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->audioPlay:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final getDisplayFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/android/mltcode/paycertificationapi/mq4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->displayFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final getMLanguageTranslationList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->mLanguageTranslationList:Ljava/util/List;

    return-object v0
.end method

.method public final getPageLeftLanguageFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageLeftLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final getPageRightLanguageFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageRightLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final getRecordingAndTranslatingFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->recordingAndTranslatingFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final isEqualOtherLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;Z)Z
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageLeftLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;

    invoke-interface {p2}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/LanguageTranslationData;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageRightLanguageFlow:Lcom/android/mltcode/paycertificationapi/k85;

    invoke-interface {p2}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/LanguageTranslationData;

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final isRecording()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->isRecording:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final languageUpdate()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$languageUpdate$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public onCleared()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->useCase:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->IO()V

    return-void
.end method

.method public final pageExchangeLeftAndRightLanguage()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final pageLanguageSideUpdate(Lcom/sma/smartv3/model/LanguageTranslationData;I)V
    .locals 6
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageLanguageSideUpdate$1;

    const/4 v2, 0x0

    invoke-direct {v3, p2, p0, p1, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageLanguageSideUpdate$1;-><init>(ILcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/model/LanguageTranslationData;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_0
    return-void
.end method

.method public final ttsAndPlayUpdate()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->useCase:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->X01IiOiIi(Z)V

    return-void
.end method
