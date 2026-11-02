.class public final Lcom/szabh/smable3/entity/BleLocationGga;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleLocationGga$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleLocationGga.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleLocationGga.kt\ncom/szabh/smable3/entity/BleLocationGga\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,38:1\n222#2,4:39\n*S KotlinDebug\n*F\n+ 1 BleLocationGga.kt\ncom/szabh/smable3/entity/BleLocationGga\n*L\n21#1:39,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleLocationGga.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleLocationGga.kt\ncom/szabh/smable3/entity/BleLocationGga\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,38:1\n222#2,4:39\n*S KotlinDebug\n*F\n+ 1 BleLocationGga.kt\ncom/szabh/smable3/entity/BleLocationGga\n*L\n21#1:39,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleLocationGga$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x40


# instance fields
.field private altitude:F

.field private mHorizontalDilutionPrecision:F

.field private mLatitude:F

.field private mLongitude:F

.field private mTime:Lcom/szabh/smable3/entity/BleLocationUTC;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private positioningQuality:I

.field private satelliteCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleLocationGga$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleLocationGga$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleLocationGga;->Companion:Lcom/szabh/smable3/entity/BleLocationGga$Companion;

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

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleLocationGga;-><init>(Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFF)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleLocationUTC;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    .line 10
    new-instance v1, Lcom/szabh/smable3/entity/BleLocationUTC;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleLocationUTC;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p8, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 v0, p8, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    move p4, v2

    :cond_3
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_4

    move p5, v2

    :cond_4
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_5

    move p6, v1

    :cond_5
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_6

    move/from16 p8, v1

    :goto_0
    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move/from16 p8, p7

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleLocationGga;-><init>(Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleLocationGga;Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFFILjava/lang/Object;)Lcom/szabh/smable3/entity/BleLocationGga;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleLocationGga;->copy(Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFF)Lcom/szabh/smable3/entity/BleLocationGga;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/szabh/smable3/entity/BleLocationUTC;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    return-object v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    return v0
.end method

.method public final copy(Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFF)Lcom/szabh/smable3/entity/BleLocationGga;
    .locals 9
    .param p1    # Lcom/szabh/smable3/entity/BleLocationUTC;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleLocationGga;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/szabh/smable3/entity/BleLocationGga;-><init>(Lcom/szabh/smable3/entity/BleLocationUTC;FFIIFF)V

    return-object v1
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-class v0, Lcom/szabh/smable3/entity/BleLocationUTC;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleLocationUTC;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleLocationGga;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleLocationGga;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    iget p1, p1, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAltitude()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    return v0
.end method

.method public final getMHorizontalDilutionPrecision()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    return v0
.end method

.method public final getMLatitude()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    return v0
.end method

.method public final getMLongitude()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    return v0
.end method

.method public final getMTime()Lcom/szabh/smable3/entity/BleLocationUTC;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    return-object v0
.end method

.method public final getPositioningQuality()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    return v0
.end method

.method public final getSatelliteCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleLocationUTC;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAltitude(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    return-void
.end method

.method public final setMHorizontalDilutionPrecision(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    return-void
.end method

.method public final setMLatitude(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    return-void
.end method

.method public final setMLongitude(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    return-void
.end method

.method public final setMTime(Lcom/szabh/smable3/entity/BleLocationUTC;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleLocationUTC;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    return-void
.end method

.method public final setPositioningQuality(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    return-void
.end method

.method public final setSatelliteCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleLocationGga(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mTime:Lcom/szabh/smable3/entity/BleLocationUTC;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLatitude:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mLongitude:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", positioningQuality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->positioningQuality:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", satelliteCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->satelliteCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHorizontalDilutionPrecision="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->mHorizontalDilutionPrecision:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", altitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGga;->altitude:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
