.class public final Lcom/szabh/smable3/entity/GolfMapData;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mapData:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final type:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v2}, Lcom/szabh/smable3/entity/GolfMapData;-><init>([BIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    return-void
.end method

.method public synthetic constructor <init>([BIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/GolfMapData;-><init>([BI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/GolfMapData;[BIILjava/lang/Object;)Lcom/szabh/smable3/entity/GolfMapData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/GolfMapData;->copy([BI)Lcom/szabh/smable3/entity/GolfMapData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    return v0
.end method

.method public final copy([BI)Lcom/szabh/smable3/entity/GolfMapData;
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/GolfMapData;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/GolfMapData;-><init>([BI)V

    return-object v0
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    :cond_1
    return-void
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/GolfMapData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/GolfMapData;

    iget-object v1, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    iget-object v3, p1, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    iget p1, p1, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x5

    return v0
.end method

.method public final getMapData()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    return-object v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMapData([B)V
    .locals 0
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GolfMapData(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/GolfMapData;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mapData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/GolfMapData;->mapData:[B

    if-eqz v1, :cond_0

    array-length v1, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
