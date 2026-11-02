.class public final Lcom/szabh/smable3/entity/BleGirlCareSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGirlCareSettings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGirlCareSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0xa


# instance fields
.field private mEnabled:I

.field private mLatestDay:I

.field private mLatestMonth:I

.field private mLatestYear:I

.field private mMenstruationDuration:I

.field private mMenstruationPeriod:I

.field private mMenstruationReminderAdvance:I

.field private mOvulationReminderAdvance:I

.field private mReminderEnable:I

.field private mReminderHour:I

.field private mReminderMinute:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGirlCareSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGirlCareSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->Companion:Lcom/szabh/smable3/entity/BleGirlCareSettings$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/szabh/smable3/entity/BleGirlCareSettings;-><init>(IIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move p12, v0

    :goto_0
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

    :cond_a
    move p12, p11

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/szabh/smable3/entity/BleGirlCareSettings;-><init>(IIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleGirlCareSettings;IIIIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleGirlCareSettings;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget p11, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    :cond_a
    move p12, p10

    move p13, p11

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

    invoke-virtual/range {p2 .. p13}, Lcom/szabh/smable3/entity/BleGirlCareSettings;->copy(IIIIIIIIIII)Lcom/szabh/smable3/entity/BleGirlCareSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    return v0
.end method

.method public final copy(IIIIIIIIIII)Lcom/szabh/smable3/entity/BleGirlCareSettings;
    .locals 12
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleGirlCareSettings;

    move v1, p1

    move v2, p2

    move v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleGirlCareSettings;-><init>(IIIIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    const/4 v1, 0x6

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    const/4 v0, 0x0

    const/4 v2, 0x6

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    add-int/lit16 v0, v0, -0x7d0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getMEnabled()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    return v0
.end method

.method public final getMLatestDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    return v0
.end method

.method public final getMLatestMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    return v0
.end method

.method public final getMLatestYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public final getMMenstruationDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    return v0
.end method

.method public final getMMenstruationPeriod()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    return v0
.end method

.method public final getMMenstruationReminderAdvance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    return v0
.end method

.method public final getMOvulationReminderAdvance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    return v0
.end method

.method public final getMReminderEnable()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    return v0
.end method

.method public final getMReminderHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    return v0
.end method

.method public final getMReminderMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMEnabled(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    return-void
.end method

.method public final setMLatestDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    return-void
.end method

.method public final setMLatestMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    return-void
.end method

.method public final setMLatestYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    return-void
.end method

.method public final setMMenstruationDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    return-void
.end method

.method public final setMMenstruationPeriod(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    return-void
.end method

.method public final setMMenstruationReminderAdvance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    return-void
.end method

.method public final setMOvulationReminderAdvance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    return-void
.end method

.method public final setMReminderEnable(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    return-void
.end method

.method public final setMReminderHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    return-void
.end method

.method public final setMReminderMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGirlCareSettings(mEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mEnabled:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReminderEnable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderEnable:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReminderHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReminderMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mReminderMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMenstruationReminderAdvance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationReminderAdvance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mOvulationReminderAdvance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mOvulationReminderAdvance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLatestYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLatestMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLatestDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mLatestDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMenstruationDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMenstruationPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareSettings;->mMenstruationPeriod:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
