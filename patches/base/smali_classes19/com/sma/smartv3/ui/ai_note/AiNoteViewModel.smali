.class public final Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# instance fields
.field private final _aiNotesFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
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

.field private final aiNotesFLow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;>;"
        }
    .end annotation
.end field

.field private final repository:Lcom/android/mltcode/paycertificationapi/cr4;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->_aiNotesFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->aiNotesFLow:Lcom/android/mltcode/paycertificationapi/k85;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cr4;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/cr4;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->repository:Lcom/android/mltcode/paycertificationapi/cr4;

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/OXO1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai_note/OXO1$XIi00iiXO;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->_stateFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->stateFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-void
.end method

.method public static final synthetic access$get_aiNotesFlow$p(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->_aiNotesFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static final synthetic access$get_stateFlow$p(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->_stateFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static synthetic getNotes$default(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;IILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->repository:Lcom/android/mltcode/paycertificationapi/cr4;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/cr4;->O00()I

    move-result p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->getNotes(I)Lkotlinx/coroutines/XiOIO;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final deleteAllInfo()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$deleteAllInfo$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$deleteAllInfo$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final getAiNotesFLow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->aiNotesFLow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final getNotes(I)Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;ILkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public final getRepository()Lcom/android/mltcode/paycertificationapi/cr4;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->repository:Lcom/android/mltcode/paycertificationapi/cr4;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->stateFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method
