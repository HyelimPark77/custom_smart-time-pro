.class public final Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ImageDesc"
.end annotation


# instance fields
.field private final colorFormat:I

.field private final compressMode:I

.field private final height:I

.field private final paletteFormat:I

.field private final reversed:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final reversedTop:I

.field private final width:I


# direct methods
.method public constructor <init>(IIIIII[B)V
    .locals 1
    .param p7    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "reversed"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    .line 3
    iput p2, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    .line 4
    iput p3, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    .line 5
    iput p4, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    .line 6
    iput p5, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    .line 7
    iput p6, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    .line 8
    iput-object p7, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    return-void
.end method

.method public synthetic constructor <init>(IIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 9
    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->LV_COLOR_FORMAT_ARGB8888:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->getValue()B

    move-result p1

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    const/4 p4, 0x0

    :cond_1
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_2

    const/16 p7, 0x10

    .line 10
    new-array p7, p7, [B

    :cond_2
    move p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    .line 11
    invoke-direct/range {p2 .. p9}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;-><init>(IIIIII[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;IIIIII[BILjava/lang/Object;)Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->copy(IIIIII[B)Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    return v0
.end method

.method public final component7()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    return-object v0
.end method

.method public final copy(IIIIII[B)Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;
    .locals 9
    .param p7    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "reversed"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;-><init>(IIIIII[B)V

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
    instance-of v1, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    iget-object p1, p1, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getColorFormat()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    return v0
.end method

.method public final getCompressMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    return v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    return v0
.end method

.method public final getPaletteFormat()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    return v0
.end method

.method public final getReversed()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    return-object v0
.end method

.method public final getReversedTop()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toByteArray()[B
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/16 v0, 0x18

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    const/16 v2, 0x10

    shl-int/2addr v1, v2

    iget v3, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    shl-int/lit8 v3, v3, 0xb

    or-int/2addr v1, v3

    iget v3, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v1, v3

    iget v3, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    or-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversed:[B

    invoke-static {v1, v2}, Lkotlin/collections/ArraysKt___ArraysKt;->X11i([BI)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XX0X0(Ljava/util/Collection;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

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

    const-string v1, "ImageDesc{colorFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->colorFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", paletteFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->paletteFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", compressMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->compressMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reversedTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->reversedTop:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceResourceDescriptor$ImageDesc;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
