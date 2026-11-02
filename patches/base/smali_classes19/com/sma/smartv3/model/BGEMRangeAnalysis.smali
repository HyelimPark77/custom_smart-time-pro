.class public final Lcom/sma/smartv3/model/BGEMRangeAnalysis;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"


# instance fields
.field private end:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private fasting:Z

.field private nBit:I

.field private ppgData:[Lcom/sma/smartv3/model/BGEMPpg;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private start:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private within2HrsMeal:Z


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

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;-><init>(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # [Lcom/sma/smartv3/model/BGEMPpg;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "start"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ppgData"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    .line 4
    iput-boolean p2, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    .line 7
    iput p5, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    .line 8
    iput-object p6, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 9
    const-string v1, ""

    if-eqz p8, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    new-array p6, v0, [Lcom/sma/smartv3/model/BGEMPpg;

    :cond_5
    move-object p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;-><init>(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/BGEMRangeAnalysis;ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;ILjava/lang/Object;)Lcom/sma/smartv3/model/BGEMRangeAnalysis;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->copy(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;)Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    return v0
.end method

.method public final component6()[Lcom/sma/smartv3/model/BGEMPpg;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;)Lcom/sma/smartv3/model/BGEMRangeAnalysis;
    .locals 8
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # [Lcom/sma/smartv3/model/BGEMPpg;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "start"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ppgData"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/BGEMRangeAnalysis;-><init>(ZZLjava/lang/String;Ljava/lang/String;I[Lcom/sma/smartv3/model/BGEMPpg;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    iget v3, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    iget-object p1, p1, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEnd()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    return-object v0
.end method

.method public final getFasting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    return v0
.end method

.method public final getNBit()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    return v0
.end method

.method public final getPpgData()[Lcom/sma/smartv3/model/BGEMPpg;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    return-object v0
.end method

.method public final getStart()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    return-object v0
.end method

.method public final getWithin2HrsMeal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setEnd(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    return-void
.end method

.method public final setFasting(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    return-void
.end method

.method public final setNBit(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    return-void
.end method

.method public final setPpgData([Lcom/sma/smartv3/model/BGEMPpg;)V
    .locals 1
    .param p1    # [Lcom/sma/smartv3/model/BGEMPpg;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    return-void
.end method

.method public final setStart(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    return-void
.end method

.method public final setWithin2HrsMeal(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->fasting:Z

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->within2HrsMeal:Z

    iget-object v2, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->start:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->end:Ljava/lang/String;

    iget v4, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->nBit:I

    iget-object v5, p0, Lcom/sma/smartv3/model/BGEMRangeAnalysis;->ppgData:[Lcom/sma/smartv3/model/BGEMPpg;

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BGEMRangeAnalysis(fasting="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", within2HrsMeal="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", start="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", end="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nBit="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ppgData="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
