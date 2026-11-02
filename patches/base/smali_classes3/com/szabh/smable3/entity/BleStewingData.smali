.class public final Lcom/szabh/smable3/entity/BleStewingData;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleStewingData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleStewingData$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0xd


# instance fields
.field private mDuration:J

.field private mEndVoltage:F

.field private mStartVoltage:F

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleStewingData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleStewingData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleStewingData;->Companion:Lcom/szabh/smable3/entity/BleStewingData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleStewingData;-><init>(IFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IFFJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    .line 6
    iput-wide p4, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    return-void
.end method

.method public synthetic constructor <init>(IFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    const-wide/16 p4, 0x0

    :cond_3
    move-wide p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    .line 7
    invoke-direct/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleStewingData;-><init>(IFFJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleStewingData;IFFJILjava/lang/Object;)Lcom/szabh/smable3/entity/BleStewingData;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-wide p4, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    :cond_3
    move-wide p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleStewingData;->copy(IFFJ)Lcom/szabh/smable3/entity/BleStewingData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    return-wide v0
.end method

.method public final copy(IFFJ)Lcom/szabh/smable3/entity/BleStewingData;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleStewingData;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleStewingData;-><init>(IFFJ)V

    return-object v0
.end method

.method public decode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)J

    move-result-wide v2

    long-to-float v2, v2

    const v3, 0x461c4000    # 10000.0f

    div-float/2addr v2, v3

    iput v2, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)J

    move-result-wide v4

    long-to-float v2, v4

    div-float/2addr v2, v3

    iput v2, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleStewingData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleStewingData;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMDuration()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    return-wide v0
.end method

.method public final getMEndVoltage()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    return v0
.end method

.method public final getMStartVoltage()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMDuration(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    return-void
.end method

.method public final setMEndVoltage(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    return-void
.end method

.method public final setMStartVoltage(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleStewingData(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStartVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mStartVoltage:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mEndVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mEndVoltage:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleStewingData;->mDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "s)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
