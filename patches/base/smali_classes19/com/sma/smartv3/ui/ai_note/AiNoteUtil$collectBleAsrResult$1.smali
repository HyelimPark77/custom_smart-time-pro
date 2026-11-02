.class final Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I1()V
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
    value = "SMAP\nAiNoteUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,238:1\n17#2:239\n19#2:243\n46#3:240\n51#3:242\n105#4:241\n*S KotlinDebug\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n*L\n152#1:239\n152#1:243\n152#1:240\n152#1:242\n152#1:241\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1"
    f = "AiNoteUtil.kt"
    i = {}
    l = {
        0x99
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAiNoteUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,238:1\n17#2:239\n19#2:243\n46#3:240\n51#3:242\n105#4:241\n*S KotlinDebug\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n*L\n152#1:239\n152#1:243\n152#1:240\n152#1:242\n152#1:241\n*E\n"
    }
.end annotation


# instance fields
.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 0
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

    new-instance p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;-><init>(Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O10IXXX0X(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->IiI10X()Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$1;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v1}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->OXi001(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lkotlin/jvm/functions/Function2;)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$invokeSuspend$$inlined$filter$1;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$invokeSuspend$$inlined$filter$1;-><init>(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;)V

    sget-object p1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;->IO:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1$OXO1;

    iput v2, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;->label:I

    invoke-interface {v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/ii0iIIX0;->collect(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
