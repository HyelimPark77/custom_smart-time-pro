.class public final Lcom/sma/smartv3/db/entity/SportData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
.end annotation


# instance fields
.field private mAirPressure:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAltitude:I
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

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMode:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStep:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    const/16 v17, 0x7fff

    const/16 v18, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

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

    const/16 v16, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v18}, Lcom/sma/smartv3/db/entity/SportData;-><init>(IJLjava/lang/String;IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;IIIIIIIIIIII)V
    .locals 1
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mLocalTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    .line 7
    iput p6, p0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    .line 8
    iput p7, p0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    .line 9
    iput p8, p0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    .line 10
    iput p9, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    .line 11
    iput p10, p0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    .line 12
    iput p11, p0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    .line 13
    iput p12, p0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    .line 14
    iput p13, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    .line 15
    iput p14, p0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const-wide/16 v3, 0x0

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    .line 18
    const-string v5, ""

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    const/16 p17, 0x0

    :goto_e
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p16, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

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
    move/from16 p17, p16

    goto :goto_e

    .line 19
    :goto_f
    invoke-direct/range {p1 .. p17}, Lcom/sma/smartv3/db/entity/SportData;-><init>(IJLjava/lang/String;IIIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/SportData;IJLjava/lang/String;IIIIIIIIIIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/SportData;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget v1, v0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    move/from16 p17, v1

    :goto_e
    move/from16 p2, p1

    move-object/from16 p1, v0

    move/from16 p16, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

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
    move/from16 p17, p16

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p17}, Lcom/sma/smartv3/db/entity/SportData;->copy(IJLjava/lang/String;IIIIIIIIIIII)Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    return v0
.end method

.method public final copy(IJLjava/lang/String;IIIIIIIIIIII)Lcom/sma/smartv3/db/entity/SportData;
    .locals 18
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/SportData;

    move/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/sma/smartv3/db/entity/SportData;-><init>(IJLjava/lang/String;IIIIIIIIIIII)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/SportData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/SportData;

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    if-eq v1, p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    return v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    return-void
.end method

.method public final setMId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    return-void
.end method

.method public final setMLocalTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 18
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/db/entity/SportData;->mId:I

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/SportData;->mTime:J

    iget-object v4, v0, Lcom/sma/smartv3/db/entity/SportData;->mLocalTime:Ljava/lang/String;

    iget v5, v0, Lcom/sma/smartv3/db/entity/SportData;->mStep:I

    iget v6, v0, Lcom/sma/smartv3/db/entity/SportData;->mDistance:I

    iget v7, v0, Lcom/sma/smartv3/db/entity/SportData;->mCalorie:I

    iget v8, v0, Lcom/sma/smartv3/db/entity/SportData;->mDuration:I

    iget v9, v0, Lcom/sma/smartv3/db/entity/SportData;->mSpm:I

    iget v10, v0, Lcom/sma/smartv3/db/entity/SportData;->mAltitude:I

    iget v11, v0, Lcom/sma/smartv3/db/entity/SportData;->mAirPressure:I

    iget v12, v0, Lcom/sma/smartv3/db/entity/SportData;->mPace:I

    iget v13, v0, Lcom/sma/smartv3/db/entity/SportData;->mSpeed:I

    iget v14, v0, Lcom/sma/smartv3/db/entity/SportData;->mMode:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/SportData;->mIsSync:I

    move/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/SportData;->mIsDelete:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v17, v15

    const-string v15, "SportData(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAirPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
