.class public final Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
    }
.end annotation


# instance fields
.field private final dataOffset:I

.field private dataSize:I

.field private final imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final type:B


# direct methods
.method public constructor <init>(BIILcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;)V
    .locals 0
    .param p4    # Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-byte p1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    .line 3
    iput p2, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    .line 4
    iput p3, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    .line 5
    iput-object p4, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    return-void
.end method

.method public synthetic constructor <init>(BIILcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;-><init>(BIILcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;BIILcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;ILjava/lang/Object;)Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-byte p1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->copy(BIILcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;)Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    return v0
.end method

.method public final component4()Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    return-object v0
.end method

.method public final copy(BIILcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;)Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;
    .locals 1
    .param p4    # Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;-><init>(BIILcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    iget-byte v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    iget-object p1, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDataOffset()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    return v0
.end method

.method public final getDataSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    return v0
.end method

.method public final getImageDesc()Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    return-object v0
.end method

.method public final getType()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    invoke-static {v0}, Ljava/lang/Byte;->hashCode(B)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setDataSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    return-void
.end method

.method public final toByteArray()[B
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/16 v0, 0x20

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    shl-int/lit8 v1, v1, 0x8

    iget-byte v2, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "array(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchFaceResourceDescriptor{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->type:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dataSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}, dataOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->dataOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", imageDesc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;->imageDesc:Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
