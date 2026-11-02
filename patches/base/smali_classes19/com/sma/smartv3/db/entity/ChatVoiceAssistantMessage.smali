.class public final Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            value = {
                "type"
            }
        .end subannotation
    }
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lcom/sma/smartv3/db/converter/FunctionTypeConverter;,
        Lcom/sma/smartv3/db/converter/ChatShowTypeConverter;,
        Lcom/sma/smartv3/db/converter/ChatAiModeConverter;
    }
.end annotation


# instance fields
.field private final aiMode:Lcom/sma/smartv3/dto/ChatAiMode;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private data:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private ended:I

.field private final id:I
    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private showType:Lcom/sma/smartv3/dto/ChatShowType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final type:Lcom/sma/smartv3/dto/FunctionType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;-><init>(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/dto/FunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/dto/ChatAiMode;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/dto/ChatShowType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    .line 7
    iput p5, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    .line 8
    iput-object p6, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 9
    const-string p2, ""

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 10
    sget-object p3, Lcom/sma/smartv3/dto/FunctionType;->THIRD_PARTY_AI_ASSISTANT:Lcom/sma/smartv3/dto/FunctionType;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 11
    sget-object p4, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {p4}, Lcom/sma/smartv3/dto/OXO1$OXO1;->iO()Lcom/sma/smartv3/dto/ChatAiMode;

    move-result-object p4

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 12
    sget-object p5, Lcom/sma/smartv3/dto/ChatEndType;->Sending:Lcom/sma/smartv3/dto/ChatEndType;

    invoke-virtual {p5}, Lcom/sma/smartv3/dto/ChatEndType;->getFlag()I

    move-result p5

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 13
    sget-object p6, Lcom/sma/smartv3/dto/ChatShowType;->FROM:Lcom/sma/smartv3/dto/ChatShowType;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 14
    invoke-direct/range {p2 .. p8}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;-><init>(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILjava/lang/Object;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->copy(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/sma/smartv3/dto/FunctionType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    return-object v0
.end method

.method public final component4()Lcom/sma/smartv3/dto/ChatAiMode;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    return v0
.end method

.method public final component6()Lcom/sma/smartv3/dto/ChatShowType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/dto/FunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/dto/ChatAiMode;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/dto/ChatShowType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;-><init>(ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    iget v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    iget-object p1, p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAiMode()Lcom/sma/smartv3/dto/ChatAiMode;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    return-object v0
.end method

.method public final getData()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnded()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    return v0
.end method

.method public final getShowType()Lcom/sma/smartv3/dto/ChatShowType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    return-object v0
.end method

.method public final getType()Lcom/sma/smartv3/dto/FunctionType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isEnded()Z
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setData(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    return-void
.end method

.method public final setEnded(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    return-void
.end method

.method public final setShowType(Lcom/sma/smartv3/dto/ChatShowType;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/dto/ChatShowType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->id:I

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->data:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->type:Lcom/sma/smartv3/dto/FunctionType;

    iget-object v3, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->aiMode:Lcom/sma/smartv3/dto/ChatAiMode;

    iget v4, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->ended:I

    iget-object v5, p0, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->showType:Lcom/sma/smartv3/dto/ChatShowType;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ChatVoiceAssistantMessage(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", data="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aiMode="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ended="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", showType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
