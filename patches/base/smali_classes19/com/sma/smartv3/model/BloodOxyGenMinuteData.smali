.class public final Lcom/sma/smartv3/model/BloodOxyGenMinuteData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private num:I

.field private total:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    iput p2, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/BloodOxyGenMinuteData;IIILjava/lang/Object;)Lcom/sma/smartv3/model/BloodOxyGenMinuteData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->copy(II)Lcom/sma/smartv3/model/BloodOxyGenMinuteData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    return v0
.end method

.method public final copy(II)Lcom/sma/smartv3/model/BloodOxyGenMinuteData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;-><init>(II)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;

    iget v1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    iget v3, p1, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    iget p1, p1, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getNum()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    return v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setNum(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    return-void
.end method

.method public final setTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->total:I

    iget v1, p0, Lcom/sma/smartv3/model/BloodOxyGenMinuteData;->num:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodOxyGenMinuteData(total="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", num="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
