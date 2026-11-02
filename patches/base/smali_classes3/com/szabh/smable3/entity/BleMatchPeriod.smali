.class public final Lcom/szabh/smable3/entity/BleMatchPeriod;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchPeriod$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchPeriod$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0xc


# instance fields
.field private mAvgBpm:I

.field private mCalorie:I

.field private mDistance:I

.field private mDuration:I

.field private mMaxBpm:I

.field private mSpeed:I

.field private mStep:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchPeriod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchPeriod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchPeriod;->Companion:Lcom/szabh/smable3/entity/BleMatchPeriod$Companion;

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

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleMatchPeriod;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

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
    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleMatchPeriod;-><init>(IIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchPeriod;IIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchPeriod;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleMatchPeriod;->copy(IIIIIII)Lcom/szabh/smable3/entity/BleMatchPeriod;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    return v0
.end method

.method public final copy(IIIIIII)Lcom/szabh/smable3/entity/BleMatchPeriod;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchPeriod;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleMatchPeriod;-><init>(IIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchPeriod;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchPeriod(mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mAvgBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPeriod;->mMaxBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
