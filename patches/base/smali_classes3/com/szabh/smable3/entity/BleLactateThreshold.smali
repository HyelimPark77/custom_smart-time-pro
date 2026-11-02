.class public final Lcom/szabh/smable3/entity/BleLactateThreshold;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleLactateThreshold$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleLactateThreshold$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private mAvgPower:I

.field private mMaxPower:I

.field private mMode:I

.field private mPace:I

.field private mPower:I

.field private mSpeed:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleLactateThreshold$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleLactateThreshold$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleLactateThreshold;->Companion:Lcom/szabh/smable3/entity/BleLactateThreshold$Companion;

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

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleLactateThreshold;-><init>(IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

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
    invoke-direct/range {p1 .. p7}, Lcom/szabh/smable3/entity/BleLactateThreshold;-><init>(IIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleLactateThreshold;IIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleLactateThreshold;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleLactateThreshold;->copy(IIIIII)Lcom/szabh/smable3/entity/BleLactateThreshold;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    return v0
.end method

.method public final copy(IIIIII)Lcom/szabh/smable3/entity/BleLactateThreshold;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleLactateThreshold;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleLactateThreshold;-><init>(IIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleLactateThreshold;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleLactateThreshold;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMAvgPower()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    return v0
.end method

.method public final getMMaxPower()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    return v0
.end method

.method public final getMPower()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAvgPower(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    return-void
.end method

.method public final setMMaxPower(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    return-void
.end method

.method public final setMPower(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleLactateThreshold(mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mPower:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mAvgPower:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mMaxPower:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLactateThreshold;->mSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
