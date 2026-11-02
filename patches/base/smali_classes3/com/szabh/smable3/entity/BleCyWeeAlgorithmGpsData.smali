.class public final Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;
.super Lcom/szabh/smable3/entity/BleIdObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x32


# instance fields
.field private mAltitude:I

.field private mCourse:F

.field private mHorizontalAccuracy:F

.field private mLatitude:F

.field private mLongitude:F

.field private mSpeed:F

.field private mVerticalAccuracy:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->Companion:Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;-><init>(FFIFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FFIFFFF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIdObject;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    return-void
.end method

.method public synthetic constructor <init>(FFIFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;-><init>(FFIFFFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;FFIFFFFILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->copy(FFIFFFF)Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    return v0
.end method

.method public final copy(FFIFFFF)Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;-><init>(FFIFFFF)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    iget p1, p1, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    return v0
.end method

.method public final getMCourse()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    return v0
.end method

.method public final getMHorizontalAccuracy()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    return v0
.end method

.method public final getMLatitude()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x32

    return v0
.end method

.method public final getMLongitude()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    return v0
.end method

.method public final getMSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    return v0
.end method

.method public final getMVerticalAccuracy()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    return-void
.end method

.method public final setMCourse(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    return-void
.end method

.method public final setMHorizontalAccuracy(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    return-void
.end method

.method public final setMLatitude(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    return-void
.end method

.method public final setMLongitude(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    return-void
.end method

.method public final setMSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    return-void
.end method

.method public final setMVerticalAccuracy(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCyWeeAlgorithmGpsData(mLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLongitude:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mLatitude:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mCourse:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mHorizontalAccuracy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mHorizontalAccuracy:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mVerticalAccuracy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCyWeeAlgorithmGpsData;->mVerticalAccuracy:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
