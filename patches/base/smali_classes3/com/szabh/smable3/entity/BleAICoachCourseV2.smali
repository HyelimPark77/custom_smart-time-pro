.class public final Lcom/szabh/smable3/entity/BleAICoachCourseV2;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mCourseID:I

.field private mCourseLowerBoundHR:I

.field private mCourseLowerBoundSpeech:I

.field private mCourseTime:I

.field private mCourseUpperBoundHR:I

.field private mCourseUpperBoundSpeech:I


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

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleAICoachCourseV2;-><init>(IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

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

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p7, p6

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/szabh/smable3/entity/BleAICoachCourseV2;-><init>(IIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachCourseV2;IIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachCourseV2;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->copy(IIIIII)Lcom/szabh/smable3/entity/BleAICoachCourseV2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    return v0
.end method

.method public final copy(IIIIII)Lcom/szabh/smable3/entity/BleAICoachCourseV2;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleAICoachCourseV2;-><init>(IIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMCourseID()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    return v0
.end method

.method public final getMCourseLowerBoundHR()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    return v0
.end method

.method public final getMCourseLowerBoundSpeech()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    return v0
.end method

.method public final getMCourseTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    return v0
.end method

.method public final getMCourseUpperBoundHR()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    return v0
.end method

.method public final getMCourseUpperBoundSpeech()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCourseID(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    return-void
.end method

.method public final setMCourseLowerBoundHR(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    return-void
.end method

.method public final setMCourseLowerBoundSpeech(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    return-void
.end method

.method public final setMCourseTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    return-void
.end method

.method public final setMCourseUpperBoundHR(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    return-void
.end method

.method public final setMCourseUpperBoundSpeech(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAICoachCourse(mCourseID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseUpperBoundHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseLowerBoundHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseUpperBoundSpeech="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseUpperBoundSpeech:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseLowerBoundSpeech="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourseV2;->mCourseLowerBoundSpeech:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
