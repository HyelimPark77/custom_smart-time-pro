.class public final Lcom/szabh/smable3/watchface/WatchFaceHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private crc:I

.field private final elementCount:I

.field private final feature:I

.field private final magic:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final platform:I

.field private final resDescCount:I

.field private final reversed:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private size:I

.field private final timestamp:J

.field private final type:I

.field private final version:I


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0x7ff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/szabh/smable3/watchface/WatchFaceHeader;-><init>([BJIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>([BJIIIIIIII[B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "magic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reversed"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    .line 4
    iput-wide p2, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    .line 5
    iput p4, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    .line 6
    iput p5, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    .line 7
    iput p6, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    .line 8
    iput p7, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    .line 9
    iput p8, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    .line 10
    iput p9, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    .line 11
    iput p10, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    .line 12
    iput p11, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    .line 13
    iput-object p12, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    return-void
.end method

.method public synthetic constructor <init>([BJIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 14
    const-string p1, "WFB"

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "getBytes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->iO0iiOi([BB)[B

    move-result-object p1

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_2

    :cond_3
    move/from16 v5, p5

    :goto_2
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    .line 16
    sget-object v6, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$McuPlatform;->JL707N:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$McuPlatform;

    invoke-virtual {v6}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$McuPlatform;->getValue()I

    move-result v6

    goto :goto_3

    :cond_4
    move/from16 v6, p6

    :goto_3
    and-int/lit8 v7, v0, 0x20

    const/4 v8, 0x1

    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_4

    :cond_5
    move/from16 v7, p7

    :goto_4
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    goto :goto_5

    :cond_6
    move/from16 v8, p8

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v2

    goto :goto_6

    :cond_7
    move/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move v10, v2

    goto :goto_7

    :cond_8
    move/from16 v10, p10

    :goto_7
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    goto :goto_8

    :cond_9
    move/from16 v2, p11

    :goto_8
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    const/16 v0, 0x2b

    .line 17
    new-array v0, v0, [B

    move-object/from16 p14, v0

    :goto_9
    move-object p2, p0

    move-object p3, p1

    move/from16 p6, v1

    move/from16 p13, v2

    move-wide/from16 p4, v3

    move/from16 p7, v5

    move/from16 p8, v6

    move/from16 p9, v7

    move/from16 p10, v8

    move/from16 p11, v9

    move/from16 p12, v10

    goto :goto_a

    :cond_a
    move-object/from16 p14, p12

    goto :goto_9

    .line 18
    :goto_a
    invoke-direct/range {p2 .. p14}, Lcom/szabh/smable3/watchface/WatchFaceHeader;-><init>([BJIIIIIIII[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/watchface/WatchFaceHeader;[BJIIIIIIII[BILjava/lang/Object;)Lcom/szabh/smable3/watchface/WatchFaceHeader;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-wide p2, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p4, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p5, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p6, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p7, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p8, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p9, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p10, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p11, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    :cond_9
    and-int/lit16 p13, p13, 0x400

    if-eqz p13, :cond_a

    iget-object p12, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    :cond_a
    move p13, p11

    move-object p14, p12

    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p14}, Lcom/szabh/smable3/watchface/WatchFaceHeader;->copy([BJIIIIIIII[B)Lcom/szabh/smable3/watchface/WatchFaceHeader;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    return v0
.end method

.method public final component11()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    return v0
.end method

.method public final copy([BJIIIIIIII[B)Lcom/szabh/smable3/watchface/WatchFaceHeader;
    .locals 14
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "magic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reversed"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/watchface/WatchFaceHeader;

    move-object v2, p1

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lcom/szabh/smable3/watchface/WatchFaceHeader;-><init>([BJIIIIIIII[B)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    iget-object v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    iget-wide v5, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    iget-object p1, p1, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCrc()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    return v0
.end method

.method public final getElementCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    return v0
.end method

.method public final getFeature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    return v0
.end method

.method public final getMagic()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    return-object v0
.end method

.method public final getPlatform()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    return v0
.end method

.method public final getResDescCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    return v0
.end method

.method public final getReversed()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    return v0
.end method

.method public final getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    return-wide v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    return v0
.end method

.method public final getVersion()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCrc(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    return-void
.end method

.method public final setSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    return-void
.end method

.method public final toByteArray()[B
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/16 v0, 0x40

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->magic:[B

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lkotlin/collections/ArraysKt___ArraysKt;->X11i([BI)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XX0X0(Ljava/util/Collection;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-wide v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->timestamp:J

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->platform:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->version:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->feature:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->type:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->reversed:[B

    const/16 v2, 0x2b

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

    const-string v1, "WatchFaceHeader{size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", crc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->crc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}, elementCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->elementCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resDescCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceHeader;->resDescCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
