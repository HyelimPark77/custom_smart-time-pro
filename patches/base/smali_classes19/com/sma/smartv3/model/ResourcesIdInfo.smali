.class public final Lcom/sma/smartv3/model/ResourcesIdInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private isSelect:Z

.field private resId:I

.field private secondaryId:I


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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    iput p2, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    iput-boolean p3, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    return-void
.end method

.method public synthetic constructor <init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/ResourcesIdInfo;IIZILjava/lang/Object;)Lcom/sma/smartv3/model/ResourcesIdInfo;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/model/ResourcesIdInfo;->copy(IIZ)Lcom/sma/smartv3/model/ResourcesIdInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    return v0
.end method

.method public final copy(IIZ)Lcom/sma/smartv3/model/ResourcesIdInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/model/ResourcesIdInfo;-><init>(IIZ)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/ResourcesIdInfo;

    iget v1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    iget v3, p1, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    iget v3, p1, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getResId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    return v0
.end method

.method public final getSecondaryId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSelect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    return v0
.end method

.method public final setResId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    return-void
.end method

.method public final setSecondaryId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    return-void
.end method

.method public final setSelect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->resId:I

    iget v1, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->secondaryId:I

    iget-boolean v2, p0, Lcom/sma/smartv3/model/ResourcesIdInfo;->isSelect:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ResourcesIdInfo(resId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isSelect="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
