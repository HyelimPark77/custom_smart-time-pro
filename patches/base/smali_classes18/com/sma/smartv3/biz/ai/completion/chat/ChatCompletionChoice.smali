.class public final Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"


# instance fields
.field private delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private finishReason:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private index:I


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;-><init>(ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;)V
    .locals 1
    .param p2    # Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "delta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finishReason"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    new-instance v0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    const-string p3, ""

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;-><init>(ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->copy(ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;)Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    return v0
.end method

.method public final component2()Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;)Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;
    .locals 1
    .param p2    # Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "delta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finishReason"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;-><init>(ILcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;

    iget v1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    iget v3, p1, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    iget-object v3, p1, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDelta()Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    return-object v0
.end method

.method public final getFinishReason()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setDelta(Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    return-void
.end method

.method public final setFinishReason(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    return-void
.end method

.method public final setIndex(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->index:I

    iget-object v1, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->delta:Lcom/sma/smartv3/biz/ai/completion/chat/ChatMessage;

    iget-object v2, p0, Lcom/sma/smartv3/biz/ai/completion/chat/ChatCompletionChoice;->finishReason:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ChatCompletionChoice(index="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", delta="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", finishReason="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
