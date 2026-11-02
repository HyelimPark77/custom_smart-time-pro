.class public final Lcom/szabh/smable3/entity/BleLocationGsv;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleLocationGsv$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleLocationGsv$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private azimuth:I

.field private elevation:I

.field private satelliteNo:I

.field private snr:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleLocationGsv$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleLocationGsv$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleLocationGsv;->Companion:Lcom/szabh/smable3/entity/BleLocationGsv$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleLocationGsv;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleLocationGsv;-><init>(IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleLocationGsv;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleLocationGsv;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleLocationGsv;->copy(IIII)Lcom/szabh/smable3/entity/BleLocationGsv;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    return v0
.end method

.method public final copy(IIII)Lcom/szabh/smable3/entity/BleLocationGsv;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleLocationGsv;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleLocationGsv;-><init>(IIII)V

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

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleLocationGsv;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleLocationGsv;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAzimuth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    return v0
.end method

.method public final getElevation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    return v0
.end method

.method public final getSatelliteNo()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    return v0
.end method

.method public final getSnr()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAzimuth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    return-void
.end method

.method public final setElevation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    return-void
.end method

.method public final setSatelliteNo(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    return-void
.end method

.method public final setSnr(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleLocationGsv(satelliteNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->satelliteNo:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", elevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->elevation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", azimuth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->azimuth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", snr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLocationGsv;->snr:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
