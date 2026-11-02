.class final Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->getNotes(I)Lkotlinx/coroutines/XiOIO;
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
    value = "SMAP\nAiNoteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n774#2:38\n865#2,2:39\n*S KotlinDebug\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n*L\n27#1:38\n27#1:39,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.ai_note.AiNoteViewModel$getNotes$1"
    f = "AiNoteViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAiNoteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n774#2:38\n865#2,2:39\n*S KotlinDebug\n*F\n+ 1 AiNoteViewModel.kt\ncom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1\n*L\n27#1:38\n27#1:39,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $type:I

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;

    iput p2, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->$type:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;

    iget v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->$type:I

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;ILkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->access$get_stateFlow$p(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/OXO1$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai_note/OXO1$XO0O10;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->getRepository()Lcom/android/mltcode/paycertificationapi/cr4;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->$type:I

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/cr4;->IiI10X(I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->access$get_aiNotesFlow$p(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel$getNotes$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;->access$get_stateFlow$p(Lcom/sma/smartv3/ui/ai_note/AiNoteViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/OXO1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai_note/OXO1$XIi00iiXO;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
