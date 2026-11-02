.class public final Lcom/szabh/smable3/entity/BleGSensorSHSY;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGSensorSHSY$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGSensorSHSY$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x14


# instance fields
.field private mActivityMode:I

.field private mHr:I

.field private mSleepParticularCase:I

.field private mStep:I

.field private mTime:J

.field private mX:S

.field private mY:S

.field private mZ:S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGSensorSHSY$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGSensorSHSY$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->Companion:Lcom/szabh/smable3/entity/BleGSensorSHSY$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0xff

    const/4 v11, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleGSensorSHSY;-><init>(JSSSIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JSSSIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    .line 4
    iput-short p3, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    .line 5
    iput-short p4, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    .line 6
    iput-short p5, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    .line 7
    iput p6, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    .line 8
    iput p7, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    .line 9
    iput p8, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    .line 10
    iput p9, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    return-void
.end method

.method public synthetic constructor <init>(JSSSIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move v3, p2

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    move v4, p2

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    move v5, p2

    goto :goto_2

    :cond_3
    move v5, p5

    :goto_2
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    move v6, p2

    goto :goto_3

    :cond_4
    move/from16 v6, p6

    :goto_3
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    move v7, p2

    goto :goto_4

    :cond_5
    move/from16 v7, p7

    :goto_4
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    move v8, p2

    goto :goto_5

    :cond_6
    move/from16 v8, p8

    :goto_5
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    move v9, p2

    :goto_6
    move-object v0, p0

    goto :goto_7

    :cond_7
    move/from16 v9, p9

    goto :goto_6

    .line 11
    :goto_7
    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleGSensorSHSY;-><init>(JSSSIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleGSensorSHSY;JSSSIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleGSensorSHSY;
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-short p3, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    :cond_1
    move v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-short p4, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    :cond_2
    move v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-short p5, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    :cond_3
    move v5, p5

    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    move v6, p1

    goto :goto_0

    :cond_4
    move/from16 v6, p6

    :goto_0
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    move v7, p1

    goto :goto_1

    :cond_5
    move/from16 v7, p7

    :goto_1
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    move v8, p1

    goto :goto_2

    :cond_6
    move/from16 v8, p8

    :goto_2
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    move v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_7
    move/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleGSensorSHSY;->copy(JSSSIIII)Lcom/szabh/smable3/entity/BleGSensorSHSY;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    return-wide v0
.end method

.method public final component2()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    return v0
.end method

.method public final component3()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    return v0
.end method

.method public final component4()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    return v0
.end method

.method public final copy(JSSSIIII)Lcom/szabh/smable3/entity/BleGSensorSHSY;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleGSensorSHSY;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleGSensorSHSY;-><init>(JSSSIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput-short v2, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput-short v2, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput-short v2, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;

    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    iget-short v3, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    iget-short v3, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    iget-short v3, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMActivityMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    return v0
.end method

.method public final getMHr()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    return v0
.end method

.method public final getMSleepParticularCase()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    return-wide v0
.end method

.method public final getMX()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    return v0
.end method

.method public final getMY()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    return v0
.end method

.method public final getMZ()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMActivityMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    return-void
.end method

.method public final setMHr(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    return-void
.end method

.method public final setMSleepParticularCase(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    return-void
.end method

.method public final setMX(S)V
    .locals 0

    iput-short p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    return-void
.end method

.method public final setMY(S)V
    .locals 0

    iput-short p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    return-void
.end method

.method public final setMZ(S)V
    .locals 0

    iput-short p1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGSensorSHSY(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mX:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mY:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mZ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mZ:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mActivityMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mActivityMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSleepParticularCase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mSleepParticularCase:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGSensorSHSY;->mHr:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
