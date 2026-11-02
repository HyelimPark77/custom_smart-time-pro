.class public final Lcom/sma/smartv3/model/AIQuestion;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private enableSearch:Z

.field private extra:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private model:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private stream:Z

.field private text:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private type:Lcom/sma/smartv3/model/AIFunctionType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AIFunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extra"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    .line 6
    iput-boolean p5, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    .line 7
    iput-boolean p6, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x2

    .line 8
    const-string v0, ""

    if-eqz p8, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_1

    .line 9
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    :cond_1
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_3

    move p5, v0

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_4

    .line 10
    sget-object p6, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p6}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p6

    const-string p7, "SUPPORT_NETWORK_CHAT"

    invoke-virtual {p6, p7, v0}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result p6

    :cond_4
    move p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 11
    invoke-direct/range {p1 .. p7}, Lcom/sma/smartv3/model/AIQuestion;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/sma/smartv3/model/AIQuestion;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/model/AIQuestion;->copy(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)Lcom/sma/smartv3/model/AIQuestion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/model/AIFunctionType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    return v0
.end method

.method public final copy(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)Lcom/sma/smartv3/model/AIQuestion;
    .locals 8
    .param p1    # Lcom/sma/smartv3/model/AIFunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extra"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/AIQuestion;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/AIQuestion;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/AIQuestion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/AIQuestion;

    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEnableSearch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    return v0
.end method

.method public final getExtra()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    return-object v0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final getStream()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/sma/smartv3/model/AIFunctionType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setEnableSearch(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    return-void
.end method

.method public final setExtra(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    return-void
.end method

.method public final setModel(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    return-void
.end method

.method public final setStream(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    return-void
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    return-void
.end method

.method public final setType(Lcom/sma/smartv3/model/AIFunctionType;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AIFunctionType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/AIQuestion;->type:Lcom/sma/smartv3/model/AIFunctionType;

    iget-object v1, p0, Lcom/sma/smartv3/model/AIQuestion;->text:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/model/AIQuestion;->extra:Ljava/lang/Object;

    iget-object v3, p0, Lcom/sma/smartv3/model/AIQuestion;->model:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/sma/smartv3/model/AIQuestion;->stream:Z

    iget-boolean v5, p0, Lcom/sma/smartv3/model/AIQuestion;->enableSearch:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AIQuestion(type="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", extra="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", model="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stream="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableSearch="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
