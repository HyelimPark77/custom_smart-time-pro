.class public final Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mMac"
            }
        .end subannotation
    }
.end annotation


# instance fields
.field private isActive:Z
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAvailableStorage:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBattery:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mId:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMac:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mName:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTotalStorage:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mVersion:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mVoltage:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 18

    .line 1
    const/16 v16, 0x7ff

    const/16 v17, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v17}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)V
    .locals 1
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mLocalTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mMac"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mName"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mVersion"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    .line 4
    iput-wide p3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    .line 5
    iput-object p5, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    .line 9
    iput p9, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    .line 10
    iput-wide p10, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    .line 11
    iput-wide p12, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    .line 12
    iput-boolean p14, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    move/from16 p1, p15

    .line 13
    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 14
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 15
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "format(...)"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object/from16 v1, p5

    :goto_2
    and-int/lit8 v8, v0, 0x8

    .line 16
    const-string v9, ""

    if-eqz v8, :cond_3

    move-object v8, v9

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    move-object v10, v9

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v11, v0, 0x40

    const/4 v12, 0x0

    if-eqz v11, :cond_6

    move v11, v12

    goto :goto_6

    :cond_6
    move/from16 v11, p9

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    move-wide v13, v2

    goto :goto_7

    :cond_7
    move-wide/from16 v13, p10

    :goto_7
    and-int/lit16 v15, v0, 0x100

    if-eqz v15, :cond_8

    goto :goto_8

    :cond_8
    move-wide/from16 v2, p12

    :goto_8
    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    move v15, v12

    goto :goto_9

    :cond_9
    move/from16 v15, p14

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    move/from16 p16, v12

    :goto_a
    move-object/from16 p1, p0

    move-object/from16 p6, v1

    move-wide/from16 p13, v2

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move-object/from16 p7, v8

    move-object/from16 p9, v9

    move-object/from16 p8, v10

    move/from16 p10, v11

    move-wide/from16 p11, v13

    move/from16 p15, v15

    goto :goto_b

    :cond_a
    move/from16 p16, p15

    goto :goto_a

    :goto_b
    invoke-direct/range {p1 .. p16}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-wide v11, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    goto :goto_8

    :cond_8
    move-wide/from16 v13, p12

    :goto_8
    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget-boolean v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    goto :goto_9

    :cond_9
    move/from16 v15, p14

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    move/from16 p16, v1

    :goto_a
    move-object/from16 p1, v0

    move-wide/from16 p2, v2

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-wide/from16 p11, v11

    move-wide/from16 p13, v13

    move/from16 p15, v15

    goto :goto_b

    :cond_a
    move/from16 p16, p15

    goto :goto_a

    :goto_b
    invoke-virtual/range {p1 .. p16}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    return-wide v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    return v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    return-wide v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    return-wide v0
.end method

.method public final copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 17
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mMac"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mName"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mVersion"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move/from16 v10, p9

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    move/from16 v15, p14

    move/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getFirmwareFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "AI_Note"

    return-object v0
.end method

.method public final getMAvailableStorage()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    return-wide v0
.end method

.method public final getMBattery()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    return v0
.end method

.method public final getMId()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    return-wide v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMMac()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    return-object v0
.end method

.method public final getMName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    return-wide v0
.end method

.method public final getMTotalStorage()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    return-wide v0
.end method

.method public final getMVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getMVoltage()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    return v0
.end method

.method public final getSimpleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Aura"

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isActive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    return v0
.end method

.method public final setActive(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    return-void
.end method

.method public final setMAvailableStorage(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    return-void
.end method

.method public final setMBattery(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    return-void
.end method

.method public final setMId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

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

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMMac(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    return-void
.end method

.method public final setMName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    return-void
.end method

.method public final setMTotalStorage(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    return-void
.end method

.method public final setMVersion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    return-void
.end method

.method public final setMVoltage(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 17
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mId:J

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTime:J

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mLocalTime:Ljava/lang/String;

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mMac:Ljava/lang/String;

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mName:Ljava/lang/String;

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVersion:Ljava/lang/String;

    iget v9, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mBattery:I

    iget-wide v10, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mTotalStorage:J

    iget-wide v12, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mAvailableStorage:J

    iget-boolean v14, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive:Z

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->mVoltage:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v15

    const-string v15, "RecordDeviceInfo(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mMac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mBattery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTotalStorage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mAvailableStorage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", isActive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mVoltage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
