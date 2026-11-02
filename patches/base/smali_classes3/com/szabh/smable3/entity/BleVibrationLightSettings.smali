.class public final Lcom/szabh/smable3/entity/BleVibrationLightSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleVibrationLightSettings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleVibrationLightSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0xc


# instance fields
.field private mLight:I

.field private mLightDuration:I

.field private mLightFreq:I

.field private mLightType:I

.field private mVibration:I

.field private mVibrationDurationAndCount:I

.field private mVibrationLongAndShort:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleVibrationLightSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleVibrationLightSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->Companion:Lcom/szabh/smable3/entity/BleVibrationLightSettings$Companion;

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

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVibrationLightSettings;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move p3, v0

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
    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleVibrationLightSettings;-><init>(IIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleVibrationLightSettings;IIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleVibrationLightSettings;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->copy(IIIIIII)Lcom/szabh/smable3/entity/BleVibrationLightSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    return v0
.end method

.method public final copy(IIIIIII)Lcom/szabh/smable3/entity/BleVibrationLightSettings;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleVibrationLightSettings;-><init>(IIIIIII)V

    return-object v0
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    const/4 v0, 0x3

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final getMLight()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    return v0
.end method

.method public final getMLightDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    return v0
.end method

.method public final getMLightFreq()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    return v0
.end method

.method public final getMLightType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    return v0
.end method

.method public final getMVibration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    return v0
.end method

.method public final getMVibrationDurationAndCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    return v0
.end method

.method public final getMVibrationLongAndShort()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMLight(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    return-void
.end method

.method public final setMLightDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    return-void
.end method

.method public final setMLightFreq(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    return-void
.end method

.method public final setMLightType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    return-void
.end method

.method public final setMVibration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    return-void
.end method

.method public final setMVibrationDurationAndCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    return-void
.end method

.method public final setMVibrationLongAndShort(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleVibrationLightSettings(mVibration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVibrationLongAndShort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationLongAndShort:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVibrationDurationAndCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mVibrationDurationAndCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLightType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLightFreq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightFreq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLightDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVibrationLightSettings;->mLightDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
