.class public final Lcom/sma/smartv3/db/entity/MatchPeriod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
.end annotation


# instance fields
.field private mAvgBpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCalorie:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDuration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private mIsDelete:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMatchRecordId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxBpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStep:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
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

    invoke-direct/range {v0 .. v14}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    .line 10
    iput p8, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    .line 11
    iput p9, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    .line 12
    iput p10, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    .line 13
    iput p11, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    .line 14
    iput p12, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

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
    invoke-direct/range {p1 .. p13}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIII)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchPeriod2;J)V
    .locals 16
    .param p1    # Lcom/szabh/smable3/entity/BleMatchPeriod2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleMatchPeriod"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMDuration()I

    move-result v4

    .line 25
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMDistance()I

    move-result v5

    .line 26
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMStep()I

    move-result v6

    .line 27
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMCalorie()I

    move-result v7

    .line 28
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMSpeed()I

    move-result v8

    .line 29
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMAvgBpm()I

    move-result v9

    .line 30
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMMaxBpm()I

    move-result v10

    .line 31
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod2;->getMMaxSpeed()I

    move-result v11

    const/16 v14, 0xc03

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p0

    .line 32
    invoke-direct/range {v1 .. v15}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchPeriod;J)V
    .locals 16
    .param p1    # Lcom/szabh/smable3/entity/BleMatchPeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleMatchPeriod"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod;->getMDuration()I

    move-result v4

    .line 17
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod;->getMDistance()I

    move-result v5

    .line 18
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod;->getMStep()I

    move-result v6

    .line 19
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod;->getMCalorie()I

    move-result v7

    .line 20
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod;->getMSpeed()I

    move-result v8

    .line 21
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod;->getMAvgBpm()I

    move-result v9

    .line 22
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchPeriod;->getMMaxBpm()I

    move-result v10

    const/16 v14, 0xe03

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p0

    .line 23
    invoke-direct/range {v1 .. v15}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/MatchPeriod;IIIIIIIIIIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/MatchPeriod;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p10, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget p11, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget p12, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

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

    invoke-virtual/range {p2 .. p14}, Lcom/sma/smartv3/db/entity/MatchPeriod;->copy(IIIIIIIIIIII)Lcom/sma/smartv3/db/entity/MatchPeriod;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    return v0
.end method

.method public final copy(IIIIIIIIIIII)Lcom/sma/smartv3/db/entity/MatchPeriod;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/db/entity/MatchPeriod;

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

    invoke-direct/range {v0 .. v12}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIII)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/MatchPeriod;

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    return v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    return v0
.end method

.method public final getMMatchRecordId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    return v0
.end method

.method public final getMMaxSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    return-void
.end method

.method public final setMId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    return-void
.end method

.method public final setMMatchRecordId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    return-void
.end method

.method public final setMMaxSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mId:I

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMatchRecordId:I

    iget v2, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDuration:I

    iget v3, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mDistance:I

    iget v4, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mStep:I

    iget v5, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mCalorie:I

    iget v6, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mSpeed:I

    iget v7, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mAvgBpm:I

    iget v8, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxBpm:I

    iget v9, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mMaxSpeed:I

    iget v10, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsSync:I

    iget v11, p0, Lcom/sma/smartv3/db/entity/MatchPeriod;->mIsDelete:I

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "MatchPeriod(mId="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mMatchRecordId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mDuration="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mDistance="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mStep="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mCalorie="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mSpeed="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mAvgBpm="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mMaxBpm="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mMaxSpeed="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mIsSync="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mIsDelete="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
