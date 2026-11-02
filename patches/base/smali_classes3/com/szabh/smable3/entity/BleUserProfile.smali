.class public final Lcom/szabh/smable3/entity/BleUserProfile;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleUserProfile$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleUserProfile$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FEMALE:I = 0x0

.field public static final IMPERIAL:I = 0x1

.field public static final ITEM_LENGTH:I = 0xf

.field public static final MALE:I = 0x1

.field public static final METRIC:I = 0x0

.field public static final SECRECY:I = 0x0

.field public static final UNKNOWN:I = 0x2


# instance fields
.field private mAge:I

.field private mGender:I

.field private mHeight:F

.field private mUnit:I

.field private mUserId:I

.field private mWeight:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleUserProfile$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleUserProfile$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleUserProfile;->Companion:Lcom/szabh/smable3/entity/BleUserProfile$Companion;

    return-void
.end method

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

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleUserProfile;-><init>(IIIFFIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIFFI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    return-void
.end method

.method public synthetic constructor <init>(IIIFFIILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    const/16 p3, 0x12

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    const/high16 p4, 0x432a0000    # 170.0f

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    const/high16 p5, 0x428c0000    # 70.0f

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
    invoke-direct/range {p1 .. p7}, Lcom/szabh/smable3/entity/BleUserProfile;-><init>(IIIFFI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleUserProfile;IIIFFIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleUserProfile;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleUserProfile;->copy(IIIFFI)Lcom/szabh/smable3/entity/BleUserProfile;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    return v0
.end method

.method public final copy(IIIFFI)Lcom/szabh/smable3/entity/BleUserProfile;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleUserProfile;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleUserProfile;-><init>(IIIFFI)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleUserProfile;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleUserProfile;

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMAge()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    return v0
.end method

.method public final getMGender()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    return v0
.end method

.method public final getMHeight()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method

.method public final getMUnit()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    return v0
.end method

.method public final getMUserId()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    return v0
.end method

.method public final getMWeight()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAge(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    return-void
.end method

.method public final setMGender(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    return-void
.end method

.method public final setMHeight(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    return-void
.end method

.method public final setMUnit(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    return-void
.end method

.method public final setMUserId(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    return-void
.end method

.method public final setMWeight(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleUserProfile(mUnit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUnit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mGender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mAge:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mHeight:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mWeight:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleUserProfile;->mUserId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
