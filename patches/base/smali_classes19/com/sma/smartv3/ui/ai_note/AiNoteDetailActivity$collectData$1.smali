.class final Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->collectData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/sma/smartv3/db/entity/AIRecords;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.ai_note.AiNoteDetailActivity$collectData$1"
    f = "AiNoteDetailActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcom/sma/smartv3/db/entity/AIRecords;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->invoke(Lcom/sma/smartv3/db/entity/AIRecords;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->label:I

    if-nez v1, :cond_a

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$setContentStr$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getContentTv$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioPath()Ljava/lang/String;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_9

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PcmFile Does Not Exists :"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    :cond_5
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    :cond_6
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1, v3}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$setAudioFile$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Ljava/io/File;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/tk1;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/android/mltcode/paycertificationapi/tk1;-><init>(Ljava/io/File;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;->this$0:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    sget-object v1, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/util/ShareUtil;->OIi0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->setAudioTotalTime(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getTvTotalTime$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->getAudioTotalTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-static {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getSeekbar$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/SeekBar;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    :cond_8
    invoke-static {p1, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$setPcmAudioPlayer$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Lcom/android/mltcode/paycertificationapi/tk1;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_9
    :goto_2
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "\u5f53\u524d\u6587\u4ef6\u5df2\u635f\u574f"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
