.class public final Lcom/sma/smartv3/db/entity/MatchLog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
.end annotation


# instance fields
.field private mCancelType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCountingTime:I
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

.field private mOtherType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPeriodNumber:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPeriodTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPlayer:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStopWatchTotal:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTeam:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 18

    .line 1
    const/16 v16, 0x7fff

    const/16 v17, 0x0

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

    const/4 v15, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v17}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(IIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    .line 10
    iput p8, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    .line 11
    iput p9, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    .line 12
    iput p10, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    .line 13
    iput p11, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    .line 14
    iput p12, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    .line 15
    iput p13, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    .line 16
    iput p14, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    .line 17
    iput p15, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p16

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
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    move v15, v2

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    move/from16 p16, v2

    :goto_e
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

    move/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    .line 18
    :goto_f
    invoke-direct/range {p1 .. p16}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(IIIIIIIIIIIIIII)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchLog2;J)V
    .locals 19
    .param p1    # Lcom/szabh/smable3/entity/BleMatchLog2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleMatchLog"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMTime()I

    move-result v4

    .line 27
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMPeriodTime()I

    move-result v6

    .line 28
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMPeriodNumber()I

    move-result v7

    .line 29
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMType()I

    move-result v8

    .line 30
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMCount()I

    move-result v9

    .line 31
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMCancelType()I

    move-result v10

    .line 32
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMTeam()I

    move-result v11

    .line 33
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMPlayer()I

    move-result v12

    .line 34
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMOtherType()I

    move-result v13

    .line 35
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog2;->getMStopWatchTotal()I

    move-result v14

    const/16 v17, 0x600b

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    .line 36
    invoke-direct/range {v1 .. v18}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(IIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchLog3;J)V
    .locals 19
    .param p1    # Lcom/szabh/smable3/entity/BleMatchLog3;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleMatchLog"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMTime()I

    move-result v4

    .line 38
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMCountingTime()I

    move-result v5

    .line 39
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMPeriodTime()I

    move-result v6

    .line 40
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMPeriodNumber()I

    move-result v7

    .line 41
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMType()I

    move-result v8

    .line 42
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMCount()I

    move-result v9

    .line 43
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMCancelType()I

    move-result v10

    .line 44
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMTeam()I

    move-result v11

    .line 45
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMPlayer()I

    move-result v12

    .line 46
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMOtherType()I

    move-result v13

    .line 47
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog3;->getMStopWatchTotal()I

    move-result v14

    const/16 v17, 0x6003

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    .line 48
    invoke-direct/range {v1 .. v18}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(IIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchLog;J)V
    .locals 19
    .param p1    # Lcom/szabh/smable3/entity/BleMatchLog;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleMatchLog"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog;->getMTime()I

    move-result v4

    .line 20
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog;->getMPeriodTime()I

    move-result v6

    .line 21
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog;->getMPeriodNumber()I

    move-result v7

    .line 22
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog;->getMType()I

    move-result v8

    .line 23
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog;->getMCount()I

    move-result v9

    .line 24
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchLog;->getMCancelType()I

    move-result v10

    const/16 v17, 0x7e0b

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    .line 25
    invoke-direct/range {v1 .. v18}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(IIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/MatchLog;IIIIIIIIIIIIIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/MatchLog;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    move/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move/from16 p2, v2

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

    move/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/sma/smartv3/db/entity/MatchLog;->copy(IIIIIIIIIIIIIII)Lcom/sma/smartv3/db/entity/MatchLog;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIII)Lcom/sma/smartv3/db/entity/MatchLog;
    .locals 16
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/db/entity/MatchLog;

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

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(IIIIIIIIIIIIIII)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/MatchLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/MatchLog;

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    if-eq v1, p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getMCancelType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    return v0
.end method

.method public final getMCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    return v0
.end method

.method public final getMCountingTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    return v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    return v0
.end method

.method public final getMMatchRecordId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    return v0
.end method

.method public final getMOtherType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    return v0
.end method

.method public final getMPeriodNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    return v0
.end method

.method public final getMPeriodTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    return v0
.end method

.method public final getMPlayer()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    return v0
.end method

.method public final getMStopWatchTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    return v0
.end method

.method public final getMTeam()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCancelType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    return-void
.end method

.method public final setMCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    return-void
.end method

.method public final setMCountingTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    return-void
.end method

.method public final setMId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    return-void
.end method

.method public final setMMatchRecordId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    return-void
.end method

.method public final setMOtherType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    return-void
.end method

.method public final setMPeriodNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    return-void
.end method

.method public final setMPeriodTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    return-void
.end method

.method public final setMPlayer(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    return-void
.end method

.method public final setMStopWatchTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    return-void
.end method

.method public final setMTeam(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 17
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mId:I

    iget v2, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mMatchRecordId:I

    iget v3, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mTime:I

    iget v4, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mCountingTime:I

    iget v5, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodTime:I

    iget v6, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mPeriodNumber:I

    iget v7, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mType:I

    iget v8, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mCount:I

    iget v9, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mCancelType:I

    iget v10, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mTeam:I

    iget v11, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mPlayer:I

    iget v12, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mOtherType:I

    iget v13, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mStopWatchTotal:I

    iget v14, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsSync:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchLog;->mIsDelete:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v15

    const-string v15, "MatchLog(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMatchRecordId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCountingTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCancelType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTeam="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPlayer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mOtherType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStopWatchTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
