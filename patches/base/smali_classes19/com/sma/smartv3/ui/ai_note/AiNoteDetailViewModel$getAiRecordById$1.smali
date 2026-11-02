.class final Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->getAiRecordById(J)Lkotlinx/coroutines/XiOIO;
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
    c = "com.sma.smartv3.ui.ai_note.AiNoteDetailViewModel$getAiRecordById$1"
    f = "AiNoteDetailViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $id:J

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    iput-wide p2, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->$id:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    iget-wide v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->$id:J

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;JLkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->access$getRepository$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;)Lcom/android/mltcode/paycertificationapi/cr4;

    move-result-object p1

    iget-wide v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->$id:J

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/cr4;->XO0O10(J)Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CurrentAiNote:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel$getAiRecordById$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->access$get_aiNoteFlow$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
