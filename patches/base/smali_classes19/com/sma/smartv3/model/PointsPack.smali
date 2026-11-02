.class public final Lcom/sma/smartv3/model/PointsPack;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private amount:F

.field private id:I

.field private isSelect:Z

.field private originalAmount:F

.field private packName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private recommend:Z


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

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/model/PointsPack;-><init>(ILjava/lang/String;FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;FFZZ)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "packName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    .line 6
    iput p4, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    .line 7
    iput-boolean p5, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    .line 8
    iput-boolean p6, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 9
    const-string p2, ""

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v1, 0x0

    if-eqz p8, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v1

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move p7, v0

    :goto_0
    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p7, p6

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/sma/smartv3/model/PointsPack;-><init>(ILjava/lang/String;FFZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/PointsPack;ILjava/lang/String;FFZZILjava/lang/Object;)Lcom/sma/smartv3/model/PointsPack;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/model/PointsPack;->copy(ILjava/lang/String;FFZZ)Lcom/sma/smartv3/model/PointsPack;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;FFZZ)Lcom/sma/smartv3/model/PointsPack;
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "packName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/PointsPack;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/PointsPack;-><init>(ILjava/lang/String;FFZZ)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/PointsPack;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/PointsPack;

    iget v1, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    iget v3, p1, Lcom/sma/smartv3/model/PointsPack;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    iget v3, p1, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    iget v3, p1, Lcom/sma/smartv3/model/PointsPack;->amount:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAmount()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    return v0
.end method

.method public final getOriginalAmount()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    return v0
.end method

.method public final getPackName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecommend()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSelect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    return v0
.end method

.method public final setAmount(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    return-void
.end method

.method public final setId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    return-void
.end method

.method public final setOriginalAmount(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    return-void
.end method

.method public final setPackName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    return-void
.end method

.method public final setRecommend(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    return-void
.end method

.method public final setSelect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/PointsPack;->id:I

    iget-object v1, p0, Lcom/sma/smartv3/model/PointsPack;->packName:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/model/PointsPack;->originalAmount:F

    iget v3, p0, Lcom/sma/smartv3/model/PointsPack;->amount:F

    iget-boolean v4, p0, Lcom/sma/smartv3/model/PointsPack;->recommend:Z

    iget-boolean v5, p0, Lcom/sma/smartv3/model/PointsPack;->isSelect:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "PointsPack(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", packName="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", originalAmount="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", amount="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", recommend="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSelect="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
