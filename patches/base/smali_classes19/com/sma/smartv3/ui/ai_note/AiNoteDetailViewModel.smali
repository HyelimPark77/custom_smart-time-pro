.class public final Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# instance fields
.field private final _aiNoteFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end field

.field private final aiNoteFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end field

.field private final repository:Lcom/android/mltcode/paycertificationapi/cr4;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cr4;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/cr4;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->repository:Lcom/android/mltcode/paycertificationapi/cr4;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->_aiNoteFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->aiNoteFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-void
.end method

.method public static final synthetic access$getRepository$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;)Lcom/android/mltcode/paycertificationapi/cr4;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->repository:Lcom/android/mltcode/paycertificationapi/cr4;

    return-object p0
.end method

.method public static final synthetic access$get_aiNoteFlow$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->_aiNoteFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method


# virtual methods
.method public final getAiNoteFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->aiNoteFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final getAiRecordById(J)Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, p2, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;JLkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public final softDeleteAiNote()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$softDeleteAiNote$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$softDeleteAiNote$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method
