.class public final Lcom/szabh/smable3/entity/BleWorkout;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWorkout$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWorkout$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x30


# instance fields
.field private mAirPressure:I

.field private mAltitude:I

.field private mAvgBpm:I

.field private mCalorie:I

.field private mDistance:I

.field private mDuration:I

.field private mEnd:I

.field private mMaxBpm:I

.field private mMode:I

.field private mPace:I

.field private mSpeed:I

.field private mSpm:I

.field private mStart:I

.field private mStep:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWorkout$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout;->Companion:Lcom/szabh/smable3/entity/BleWorkout$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 17

    .line 1
    const/16 v15, 0x3fff

    const/16 v16, 0x0

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v16}, Lcom/szabh/smable3/entity/BleWorkout;-><init>(IIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    .line 14
    iput p12, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    .line 15
    iput p13, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    .line 16
    iput p14, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move v6, v2

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move v7, v2

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v2

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v2

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move v10, v2

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    move v11, v2

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    move v12, v2

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    move v13, v2

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    move v14, v2

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    move/from16 p15, v2

    :goto_d
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    goto :goto_e

    :cond_d
    move/from16 p15, p14

    goto :goto_d

    .line 17
    :goto_e
    invoke-direct/range {p1 .. p15}, Lcom/szabh/smable3/entity/BleWorkout;-><init>(IIIIIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWorkout;IIIIIIIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWorkout;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget v3, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget v4, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget v5, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    goto :goto_5

    :cond_5
    move/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget v7, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    goto :goto_6

    :cond_6
    move/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget v8, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    goto :goto_7

    :cond_7
    move/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget v9, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    goto :goto_8

    :cond_8
    move/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget v10, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget v11, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    goto :goto_a

    :cond_a
    move/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget v12, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    goto :goto_b

    :cond_b
    move/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget v13, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    goto :goto_c

    :cond_c
    move/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    move/from16 p15, v0

    :goto_d
    move-object p1, p0

    move/from16 p2, v1

    move/from16 p3, v2

    move/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

    move/from16 p7, v6

    move/from16 p8, v7

    move/from16 p9, v8

    move/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move/from16 p13, v12

    move/from16 p14, v13

    goto :goto_e

    :cond_d
    move/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/szabh/smable3/entity/BleWorkout;->copy(IIIIIIIIIIIIII)Lcom/szabh/smable3/entity/BleWorkout;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIII)Lcom/szabh/smable3/entity/BleWorkout;
    .locals 15
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout;

    move/from16 v1, p1

    move/from16 v2, p2

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

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lcom/szabh/smable3/entity/BleWorkout;-><init>(IIIIIIIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWorkout;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWorkout;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    return v0
.end method

.method public final getMEnd()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    return v0
.end method

.method public final getMStart()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    return-void
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    return-void
.end method

.method public final setMEnd(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    return-void
.end method

.method public final setMStart(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWorkout(mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mEnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAirPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAirPressure:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mAvgBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout;->mMaxBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
