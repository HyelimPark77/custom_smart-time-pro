.class public final Lcom/szabh/smable3/entity/BleAICoachCourse;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mCourseGoal:F

.field private mCourseLowerBoundHR:I

.field private mCourseRestHR:I

.field private mCourseTime:I

.field private mCourseType:I

.field private mCourseUpperBoundHR:I

.field private mRepeatTimes:I

.field private mRestMinutes:I


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleAICoachCourse;-><init>(IFIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IFIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    return-void
.end method

.method public synthetic constructor <init>(IFIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move p9, v0

    :goto_0
    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move p9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/szabh/smable3/entity/BleAICoachCourse;-><init>(IFIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachCourse;IFIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachCourse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    :cond_7
    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleAICoachCourse;->copy(IFIIIIII)Lcom/szabh/smable3/entity/BleAICoachCourse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    return v0
.end method

.method public final copy(IFIIIIII)Lcom/szabh/smable3/entity/BleAICoachCourse;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleAICoachCourse;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleAICoachCourse;-><init>(IFIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachCourse;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMCourseGoal()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    return v0
.end method

.method public final getMCourseLowerBoundHR()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    return v0
.end method

.method public final getMCourseRestHR()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    return v0
.end method

.method public final getMCourseTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    return v0
.end method

.method public final getMCourseType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    return v0
.end method

.method public final getMCourseUpperBoundHR()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final getMRepeatTimes()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    return v0
.end method

.method public final getMRestMinutes()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCourseGoal(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    return-void
.end method

.method public final setMCourseLowerBoundHR(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    return-void
.end method

.method public final setMCourseRestHR(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    return-void
.end method

.method public final setMCourseTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    return-void
.end method

.method public final setMCourseType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    return-void
.end method

.method public final setMCourseUpperBoundHR(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    return-void
.end method

.method public final setMRepeatTimes(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    return-void
.end method

.method public final setMRestMinutes(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAICoachCourse(mCourseType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseGoal:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseUpperBoundHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseUpperBoundHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseLowerBoundHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseLowerBoundHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mRestMinutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRestMinutes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseRestHR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mCourseRestHR:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mRepeatTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachCourse;->mRepeatTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
