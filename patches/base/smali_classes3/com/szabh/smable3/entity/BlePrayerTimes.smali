.class public final Lcom/szabh/smable3/entity/BlePrayerTimes;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BlePrayerTimes$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BlePrayerTimes$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0xe


# instance fields
.field private mAsrHour:I

.field private mAsrMinite:I

.field private mDhuhrHour:I

.field private mDhuhrMinite:I

.field private mFajrHour:I

.field private mFajrMinite:I

.field private mIshaHour:I

.field private mIshaMinite:I

.field private mMaghribHour:I

.field private mMaghribMinite:I

.field private mSunriseHour:I

.field private mSunriseMinite:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BlePrayerTimes$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BlePrayerTimes$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BlePrayerTimes;->Companion:Lcom/szabh/smable3/entity/BlePrayerTimes$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/szabh/smable3/entity/BlePrayerTimes;-><init>(IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    .line 14
    iput p12, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x1

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    move p11, v0

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    move p13, v0

    :goto_0
    move p12, p11

    move p11, p10

    move p10, p9

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

    :cond_b
    move p13, p12

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p13}, Lcom/szabh/smable3/entity/BlePrayerTimes;-><init>(IIIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BlePrayerTimes;IIIIIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BlePrayerTimes;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p10, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget p11, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget p12, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    :cond_b
    move p13, p11

    move p14, p12

    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/szabh/smable3/entity/BlePrayerTimes;->copy(IIIIIIIIIIII)Lcom/szabh/smable3/entity/BlePrayerTimes;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    return v0
.end method

.method public final copy(IIIIIIIIIIII)Lcom/szabh/smable3/entity/BlePrayerTimes;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BlePrayerTimes;

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BlePrayerTimes;-><init>(IIIIIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BlePrayerTimes;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    iget p1, p1, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getMAsrHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    return v0
.end method

.method public final getMAsrMinite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    return v0
.end method

.method public final getMDhuhrHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    return v0
.end method

.method public final getMDhuhrMinite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    return v0
.end method

.method public final getMFajrHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    return v0
.end method

.method public final getMFajrMinite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    return v0
.end method

.method public final getMIshaHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    return v0
.end method

.method public final getMIshaMinite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0xe

    return v0
.end method

.method public final getMMaghribHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    return v0
.end method

.method public final getMMaghribMinite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    return v0
.end method

.method public final getMSunriseHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    return v0
.end method

.method public final getMSunriseMinite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAsrHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    return-void
.end method

.method public final setMAsrMinite(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    return-void
.end method

.method public final setMDhuhrHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    return-void
.end method

.method public final setMDhuhrMinite(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    return-void
.end method

.method public final setMFajrHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    return-void
.end method

.method public final setMFajrMinite(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    return-void
.end method

.method public final setMIshaHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    return-void
.end method

.method public final setMIshaMinite(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    return-void
.end method

.method public final setMMaghribHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    return-void
.end method

.method public final setMMaghribMinite(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    return-void
.end method

.method public final setMSunriseHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    return-void
.end method

.method public final setMSunriseMinite(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BlePrayerTimes(mFajrHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFajrMinite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mFajrMinite:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunriseHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunriseMinite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mSunriseMinite:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDhuhrHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDhuhrMinite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mDhuhrMinite:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAsrHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAsrMinite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mAsrMinite:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaghribHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaghribMinite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mMaghribMinite:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIshaHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIshaMinite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BlePrayerTimes;->mIshaMinite:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
