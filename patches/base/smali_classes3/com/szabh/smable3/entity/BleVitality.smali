.class public final Lcom/szabh/smable3/entity/BleVitality;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleVitality$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleVitality$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private mAllVitality:I

.field private mHighIntensityTime:I

.field private mHighIntensityValue:I

.field private mLowIntensityTime:I

.field private mLowIntensityValue:I

.field private mMediumIntensityTime:I

.field private mMediumIntensityValue:I

.field private mTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleVitality$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleVitality$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVitality;->Companion:Lcom/szabh/smable3/entity/BleVitality$Companion;

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

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleVitality;-><init>(JIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    .line 4
    iput p3, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    .line 5
    iput p4, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    .line 6
    iput p5, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    .line 7
    iput p6, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    .line 8
    iput p7, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    .line 9
    iput p8, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    .line 10
    iput p9, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    return-void
.end method

.method public synthetic constructor <init>(JIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVitality;-><init>(JIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleVitality;JIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleVitality;
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget p4, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    :cond_2
    move v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget p5, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    :cond_3
    move v5, p5

    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    move v6, p1

    goto :goto_0

    :cond_4
    move/from16 v6, p6

    :goto_0
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    move v7, p1

    goto :goto_1

    :cond_5
    move/from16 v7, p7

    :goto_1
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    move v8, p1

    goto :goto_2

    :cond_6
    move/from16 v8, p8

    :goto_2
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    move v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_7
    move/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVitality;->copy(JIIIIIII)Lcom/szabh/smable3/entity/BleVitality;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    return v0
.end method

.method public final copy(JIIIIIII)Lcom/szabh/smable3/entity/BleVitality;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleVitality;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVitality;-><init>(JIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    sget-object v3, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    invoke-virtual {v3, v2}, Lcom/bestmafen/baseble/data/BleReadable$Companion;->timeToMillis(I)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/szabh/smable3/entity/BleVitality;->getStartOfDayCalendar(J)Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    iget v2, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    iput v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleVitality;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleVitality;

    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMAllVitality()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    return v0
.end method

.method public final getMHighIntensityTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    return v0
.end method

.method public final getMHighIntensityValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    return v0
.end method

.method public final getMLowIntensityTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    return v0
.end method

.method public final getMLowIntensityValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    return v0
.end method

.method public final getMMediumIntensityTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    return v0
.end method

.method public final getMMediumIntensityValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    return-wide v0
.end method

.method public final getStartOfDayCalendar(J)Ljava/util/Calendar;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 p1, 0xb

    const/16 p2, 0xc

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/4 p1, 0x0

    invoke-virtual {v0, p2, p1}, Ljava/util/Calendar;->set(II)V

    const/16 p2, 0xd

    invoke-virtual {v0, p2, p1}, Ljava/util/Calendar;->set(II)V

    const/16 p2, 0xe

    invoke-virtual {v0, p2, p1}, Ljava/util/Calendar;->set(II)V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAllVitality(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    return-void
.end method

.method public final setMHighIntensityTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    return-void
.end method

.method public final setMHighIntensityValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    return-void
.end method

.method public final setMLowIntensityTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    return-void
.end method

.method public final setMLowIntensityValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    return-void
.end method

.method public final setMMediumIntensityTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    return-void
.end method

.method public final setMMediumIntensityValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleVitality(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mAllVitality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mAllVitality:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLowIntensityTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLowIntensityValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mLowIntensityValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMediumIntensityTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMediumIntensityValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mMediumIntensityValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHighIntensityTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHighIntensityValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleVitality;->mHighIntensityValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
