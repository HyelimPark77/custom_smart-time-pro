.class public final Lcom/sma/smartv3/db/entity/RecordSchedule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
    tableName = "RecordSchedule"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/entity/RecordSchedule$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/db/entity/RecordSchedule$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final REPEAT_DAILY:I = 0x1

.field public static final REPEAT_MONTHLY:I = 0x3

.field public static final REPEAT_NONE:I = 0x0

.field public static final REPEAT_WEEKLY:I = 0x2

.field public static final STATUS_COMPLETED:I = 0x2

.field public static final STATUS_EXPIRED:I = 0x1

.field public static final STATUS_PLANNED:I


# instance fields
.field private mCalendarEventId:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mContent:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDeviceFileId:J
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

.field private mIsDelete:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsRemindEnabled:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLastRemindTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRemindTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRepeatType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStatus:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTitle:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/db/entity/RecordSchedule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/db/entity/RecordSchedule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->Companion:Lcom/sma/smartv3/db/entity/RecordSchedule$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 23

    .line 1
    const/16 v21, 0x3fff

    const/16 v22, 0x0

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

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v22}, Lcom/sma/smartv3/db/entity/RecordSchedule;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJ)V
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

    const-string v0, "mLocalTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTitle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    .line 4
    iput-wide p3, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    .line 5
    iput-object p5, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    .line 8
    iput p8, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    .line 9
    iput p9, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    .line 10
    iput-wide p10, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    .line 11
    iput-wide p12, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    .line 12
    iput p14, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    move-wide/from16 p1, p15

    .line 13
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    move/from16 p1, p17

    .line 14
    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    move/from16 p1, p18

    .line 15
    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    move-wide/from16 p1, p19

    .line 16
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 17
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

    .line 18
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

    .line 19
    const-string v9, ""

    if-eqz v8, :cond_3

    move-object v8, v9

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    const/4 v10, 0x0

    goto :goto_5

    :cond_5
    move/from16 v10, p8

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    const/4 v12, 0x0

    goto :goto_6

    :cond_6
    move/from16 v12, p9

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    .line 20
    new-instance v13, Ljava/util/Date;

    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    invoke-virtual {v13}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    goto :goto_7

    :cond_7
    move-wide/from16 v13, p10

    :goto_7
    and-int/lit16 v15, v0, 0x100

    if-eqz v15, :cond_8

    move-wide v15, v13

    goto :goto_8

    :cond_8
    move-wide/from16 v15, p12

    :goto_8
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    move/from16 v2, p14

    :goto_9
    and-int/lit16 v3, v0, 0x400

    if-eqz v3, :cond_a

    const-wide/16 v17, -0x1

    goto :goto_a

    :cond_a
    move-wide/from16 v17, p15

    :goto_a
    and-int/lit16 v3, v0, 0x800

    if-eqz v3, :cond_b

    const/4 v3, 0x0

    goto :goto_b

    :cond_b
    move/from16 v3, p17

    :goto_b
    and-int/lit16 v11, v0, 0x1000

    if-eqz v11, :cond_c

    const/4 v11, 0x0

    goto :goto_c

    :cond_c
    move/from16 v11, p18

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    const-wide/16 p20, 0x0

    :goto_d
    move-object/from16 p1, p0

    move-object/from16 p6, v1

    move/from16 p15, v2

    move/from16 p18, v3

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move/from16 p19, v11

    move/from16 p10, v12

    move-wide/from16 p11, v13

    move-wide/from16 p13, v15

    move-wide/from16 p16, v17

    goto :goto_e

    :cond_d
    move-wide/from16 p20, p19

    goto :goto_d

    .line 21
    :goto_e
    invoke-direct/range {p1 .. p21}, Lcom/sma/smartv3/db/entity/RecordSchedule;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/RecordSchedule;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJILjava/lang/Object;)Lcom/sma/smartv3/db/entity/RecordSchedule;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-wide v11, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    goto :goto_8

    :cond_8
    move-wide/from16 v13, p12

    :goto_8
    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    goto :goto_9

    :cond_9
    move/from16 v15, p14

    :goto_9
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_a

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    goto :goto_a

    :cond_a
    move-wide/from16 v2, p15

    :goto_a
    move-wide/from16 p1, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget v2, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    goto :goto_b

    :cond_b
    move/from16 v2, p17

    :goto_b
    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_c

    iget v3, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    goto :goto_c

    :cond_c
    move/from16 v3, p18

    :goto_c
    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_d

    move/from16 p3, v2

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    move/from16 p18, p3

    move-wide/from16 p20, v1

    :goto_d
    move-wide/from16 p16, p1

    move-object/from16 p1, v0

    move/from16 p19, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move-wide/from16 p11, v11

    move-wide/from16 p13, v13

    move/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_e

    :cond_d
    move-wide/from16 p20, p19

    move/from16 p18, v2

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p21}, Lcom/sma/smartv3/db/entity/RecordSchedule;->copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJ)Lcom/sma/smartv3/db/entity/RecordSchedule;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    return-wide v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    return v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    return-wide v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    return v0
.end method

.method public final component14()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    return v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    return-wide v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    return-wide v0
.end method

.method public final copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJ)Lcom/sma/smartv3/db/entity/RecordSchedule;
    .locals 22
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
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTitle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/RecordSchedule;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move/from16 v9, p8

    move/from16 v10, p9

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    move/from16 v15, p14

    move-wide/from16 v16, p15

    move/from16 v18, p17

    move/from16 v19, p18

    move-wide/from16 v20, p19

    invoke-direct/range {v1 .. v21}, Lcom/sma/smartv3/db/entity/RecordSchedule;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJIJIIJ)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/RecordSchedule;

    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getMCalendarEventId()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    return-wide v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDeviceFileId()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    return-wide v0
.end method

.method public final getMId()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    return-wide v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    return v0
.end method

.method public final getMIsRemindEnabled()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    return v0
.end method

.method public final getMLastRemindTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    return-wide v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMRemindTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    return-wide v0
.end method

.method public final getMRepeatType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    return v0
.end method

.method public final getMStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    return-wide v0
.end method

.method public final getMTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCalendarEventId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    return-void
.end method

.method public final setMContent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMDeviceFileId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    return-void
.end method

.method public final setMId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    return-void
.end method

.method public final setMIsRemindEnabled(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    return-void
.end method

.method public final setMLastRemindTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

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

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMRemindTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    return-void
.end method

.method public final setMRepeatType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    return-void
.end method

.method public final setMStatus(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    return-void
.end method

.method public final setMTitle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 23
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mId:J

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTime:J

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLocalTime:Ljava/lang/String;

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mTitle:Ljava/lang/String;

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mContent:Ljava/lang/String;

    iget v8, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsRemindEnabled:I

    iget v9, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRepeatType:I

    iget-wide v10, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mRemindTime:J

    iget-wide v12, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mLastRemindTime:J

    iget v14, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mStatus:I

    move/from16 v16, v14

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mCalendarEventId:J

    move-wide/from16 v17, v14

    iget v14, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsSync:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mIsDelete:I

    move/from16 v19, v14

    move/from16 v20, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/RecordSchedule;->mDeviceFileId:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v21, v14

    const-string v14, "RecordSchedule(mId="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsRemindEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRepeatType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRemindTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLastRemindTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalendarEventId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v17

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDeviceFileId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
