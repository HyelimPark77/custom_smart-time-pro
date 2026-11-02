.class public final Lcom/szabh/smable3/entity/BleGolfImageItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final distance:I

.field private final type:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    iput p2, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleGolfImageItem;IIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleGolfImageItem;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleGolfImageItem;->copy(II)Lcom/szabh/smable3/entity/BleGolfImageItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    return v0
.end method

.method public final copy(II)Lcom/szabh/smable3/entity/BleGolfImageItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleGolfImageItem;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleGolfImageItem;-><init>(II)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleGolfImageItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleGolfImageItem;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    return v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGolfImageItem(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfImageItem;->distance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
