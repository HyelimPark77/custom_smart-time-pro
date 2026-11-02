.class public final Lcom/sma/smartv3/model/AccountPoints;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private getPointFlag:I

.field private points:I

.field private userId:I


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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/AccountPoints;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    return-void
.end method

.method public synthetic constructor <init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/AccountPoints;-><init>(III)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/AccountPoints;IIIILjava/lang/Object;)Lcom/sma/smartv3/model/AccountPoints;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/model/AccountPoints;->copy(III)Lcom/sma/smartv3/model/AccountPoints;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    return v0
.end method

.method public final copy(III)Lcom/sma/smartv3/model/AccountPoints;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/AccountPoints;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/model/AccountPoints;-><init>(III)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/AccountPoints;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/AccountPoints;

    iget v1, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    iget v3, p1, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    iget v3, p1, Lcom/sma/smartv3/model/AccountPoints;->points:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    iget p1, p1, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getGetPointFlag()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    return v0
.end method

.method public final getPoints()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    return v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setGetPointFlag(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    return-void
.end method

.method public final setPoints(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    return-void
.end method

.method public final setUserId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/AccountPoints;->userId:I

    iget v1, p0, Lcom/sma/smartv3/model/AccountPoints;->points:I

    iget v2, p0, Lcom/sma/smartv3/model/AccountPoints;->getPointFlag:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AccountPoints(userId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", points="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", getPointFlag="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
