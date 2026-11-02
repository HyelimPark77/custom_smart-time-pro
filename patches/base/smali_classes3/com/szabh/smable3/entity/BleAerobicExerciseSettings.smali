.class public final Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleAerobicExerciseSettings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleAerobicExerciseSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x9


# instance fields
.field private mExerciseHour:I

.field private mExerciseMinute:I

.field private mHighHrMaxMinute:I

.field private mHighHrMaxVibration:I

.field private mHrMax:I

.field private mHrMin:I

.field private mLowHrMinMinute:I

.field private mLowHrMinVibration:I

.field private mLowOrHighHrDuration:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->Companion:Lcom/szabh/smable3/entity/BleAerobicExerciseSettings$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;-><init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v0

    :goto_0
    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;-><init>(IIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;IIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->copy(IIIIIIIII)Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    return v0
.end method

.method public final copy(IIIIIIIII)Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;-><init>(IIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMExerciseHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    return v0
.end method

.method public final getMExerciseMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    return v0
.end method

.method public final getMHighHrMaxMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    return v0
.end method

.method public final getMHighHrMaxVibration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    return v0
.end method

.method public final getMHrMax()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    return v0
.end method

.method public final getMHrMin()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method

.method public final getMLowHrMinMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    return v0
.end method

.method public final getMLowHrMinVibration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    return v0
.end method

.method public final getMLowOrHighHrDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMExerciseHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    return-void
.end method

.method public final setMExerciseMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    return-void
.end method

.method public final setMHighHrMaxMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    return-void
.end method

.method public final setMHighHrMaxVibration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    return-void
.end method

.method public final setMHrMax(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    return-void
.end method

.method public final setMHrMin(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    return-void
.end method

.method public final setMLowHrMinMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    return-void
.end method

.method public final setMLowHrMinVibration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    return-void
.end method

.method public final setMLowOrHighHrDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAerobicExerciseSettings(mExerciseHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mExerciseMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mExerciseMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrMin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMin:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHrMax:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLowHrMinMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLowHrMinVibration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowHrMinVibration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHighHrMaxMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHighHrMaxVibration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mHighHrMaxVibration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLowOrHighHrDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAerobicExerciseSettings;->mLowOrHighHrDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
