.class final Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OX()V
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
    c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$addAiNote$1"
    f = "AiNoteUtil.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xb7,
        0xb9
    }
    m = "invokeSuspend"
    n = {
        "$this$invokeSuspend_u24lambda_u240",
        "$i$a$-apply-AiNoteUtil$addAiNote$1$1",
        "$this$invokeSuspend_u24lambda_u240",
        "audioPath",
        "$i$a$-apply-AiNoteUtil$addAiNote$1$1"
    }
    s = {
        "L$1",
        "I$1",
        "L$1",
        "L$2",
        "I$1"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $type:I

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->$type:I

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

    new-instance p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;

    iget v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->$type:I

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;-><init>(ILkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget v1, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->I$0:I

    iget-object v2, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    iget-object v3, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move v13, v1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->I$1:I

    iget v4, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->I$0:I

    iget-object v5, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    iget-object v6, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object/from16 v29, v6

    move v6, v2

    move v2, v4

    move-object/from16 v4, v29

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O00()Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    move-result-object v5

    iget v2, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->$type:I

    iput-object v5, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$1:Ljava/lang/Object;

    iput v2, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->I$0:I

    const/4 v6, 0x0

    iput v6, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->I$1:I

    iput v4, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->label:I

    invoke-virtual {v5, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->O00(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v5

    :goto_0
    invoke-virtual {v5}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO()Ljava/lang/String;

    move-result-object v7

    iput-object v4, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$0:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->L$2:Ljava/lang/Object;

    iput v2, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->I$0:I

    iput v6, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->I$1:I

    iput v3, v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;->label:I

    invoke-virtual {v5, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->XO0O10(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move v13, v2

    move-object v2, v7

    :goto_2
    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIi0()Lcom/android/mltcode/paycertificationapi/cr4;

    move-result-object v1

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIX0iXi()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    if-nez v2, :cond_5

    const-string v2, ""

    :cond_5
    move-object/from16 v24, v2

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XOO0ii0()Ljava/lang/String;

    move-result-object v21

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X1ii()Ljava/lang/String;

    move-result-object v22

    new-instance v8, Lcom/sma/smartv3/db/entity/AIRecords;

    const v27, 0x1a7d7

    const/16 v28, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v8 .. v28}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v8}, Lcom/android/mltcode/paycertificationapi/cr4;->I0iXXO(Lcom/sma/smartv3/db/entity/AIRecords;)J

    move-result-wide v1

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XXI()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " handleSparkChainAsrText result:"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1
.end method
