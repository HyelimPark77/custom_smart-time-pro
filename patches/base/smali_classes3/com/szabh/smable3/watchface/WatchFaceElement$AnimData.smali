.class public final Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/watchface/WatchFaceElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AnimData"
.end annotation


# instance fields
.field private final alpha:B

.field private final byX:S

.field private final byY:S

.field private final duration:I

.field private final mode:I

.field private final px:S

.field private final py:S

.field private final rotation:I

.field private final scaleX:S

.field private final scaleY:S


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;-><init>(SSIISSISSBILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(SSIISSISSB)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-short p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    .line 4
    iput-short p2, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    .line 5
    iput p3, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    .line 7
    iput-short p5, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    .line 8
    iput-short p6, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    .line 9
    iput p7, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    .line 10
    iput-short p8, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    .line 11
    iput-short p9, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    .line 12
    iput-byte p10, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    return-void
.end method

.method public synthetic constructor <init>(SSIISSISSBILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move p11, v0

    :goto_0
    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;-><init>(SSIISSISSB)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;SSIISSISSBILjava/lang/Object;)Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-short p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-short p2, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-short p5, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-short p6, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-short p8, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-short p9, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-byte p10, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    :cond_9
    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->copy(SSIISSISSB)Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    return v0
.end method

.method public final component10()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    return v0
.end method

.method public final component2()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    return v0
.end method

.method public final component5()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    return v0
.end method

.method public final component6()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    return v0
.end method

.method public final component8()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    return v0
.end method

.method public final component9()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    return v0
.end method

.method public final copy(SSIISSISSB)Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;-><init>(SSIISSISSB)V

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
    instance-of v1, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    iget-short v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    iget-short v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    iget-short v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    iget-short v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    iget v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    iget-short v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    iget-short v3, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    iget-byte p1, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAlpha()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    return v0
.end method

.method public final getByX()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    return v0
.end method

.method public final getByY()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    return v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    return v0
.end method

.method public final getMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    return v0
.end method

.method public final getPx()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    return v0
.end method

.method public final getPy()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    return v0
.end method

.method public final getRotation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    return v0
.end method

.method public final getScaleX()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    return v0
.end method

.method public final getScaleY()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-short v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    invoke-static {v0}, Ljava/lang/Short;->hashCode(S)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

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

    const-string v1, "AnimData(px="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->px:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", py="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->py:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->duration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", byX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byX:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", byY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->byY:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->rotation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scaleX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleX:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scaleY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->scaleY:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$AnimData;->alpha:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
