.class public final Lcom/sma/smartv3/db/entity/BloodGlucose2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mMeasurementId"
            }
        .end subannotation
    }
.end annotation


# instance fields
.field private mCompletedProgress:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private final mCurrentLevel:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mEndTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFasting:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private final mId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private final mInsights:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private final mLocaleInsights:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLocaleTips:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLowerBound:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMeasurementId:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mModelNo:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRiskCode:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStartTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private final mTips:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mUpperBound:D
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mUserId:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWithin2hrsMeal:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 26

    .line 1
    const v24, 0xfffff

    const/16 v25, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v25}, Lcom/sma/smartv3/db/entity/BloodGlucose2;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 10
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
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
    .param p17    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object/from16 v4, p17

    move-object/from16 v5, p18

    move-object/from16 v6, p19

    move-object/from16 v7, p20

    move-object/from16 v8, p21

    const-string v9, "mMeasurementId"

    invoke-static {p4, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mUserId"

    invoke-static {p5, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mStartTime"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mEndTime"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mModelNo"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mRiskCode"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mInsights"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mTips"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mLocaleInsights"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mLocaleTips"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    .line 7
    iput-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    .line 8
    iput-object v2, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    .line 9
    iput-object v3, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    move-wide/from16 p1, p9

    .line 10
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    move-wide/from16 p1, p11

    .line 11
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    move/from16 p1, p13

    .line 12
    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    move/from16 p1, p14

    .line 13
    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    move/from16 p1, p15

    .line 14
    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    move/from16 p1, p16

    .line 15
    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    .line 16
    iput-object v4, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    .line 17
    iput-object v5, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    .line 18
    iput-object v6, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    .line 19
    iput-object v7, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    .line 20
    iput-object v8, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    move/from16 p1, p22

    .line 21
    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    move/from16 p1, p23

    .line 22
    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p24

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

    .line 23
    const-string v6, ""

    if-eqz v5, :cond_2

    move-object v5, v6

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    move-object v7, v6

    goto :goto_3

    :cond_3
    move-object/from16 v7, p5

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    move-object v8, v6

    goto :goto_4

    :cond_4
    move-object/from16 v8, p6

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    move-object v9, v6

    goto :goto_5

    :cond_5
    move-object/from16 v9, p7

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    move-object v10, v6

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v11, v0, 0x80

    const-wide/16 v12, 0x0

    if-eqz v11, :cond_7

    move-wide v14, v12

    goto :goto_7

    :cond_7
    move-wide/from16 v14, p9

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    goto :goto_8

    :cond_8
    move-wide/from16 v12, p11

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move/from16 v11, p13

    :goto_9
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    move/from16 v2, p14

    :goto_a
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    const/4 v1, 0x0

    goto :goto_b

    :cond_b
    move/from16 v1, p15

    :goto_b
    move/from16 p2, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    const/4 v1, 0x0

    goto :goto_c

    :cond_c
    move/from16 v1, p16

    :goto_c
    move/from16 p3, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    move-object v1, v6

    goto :goto_d

    :cond_d
    move-object/from16 v1, p17

    :goto_d
    move-object/from16 p4, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    move-object v1, v6

    goto :goto_e

    :cond_e
    move-object/from16 v1, p18

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    move-object/from16 v16, v6

    goto :goto_f

    :cond_f
    move-object/from16 v16, p19

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    move-object/from16 v17, v6

    goto :goto_10

    :cond_10
    move-object/from16 v17, p20

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    goto :goto_11

    :cond_11
    move-object/from16 v6, p21

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, v0, v18

    if-eqz v18, :cond_12

    const/16 v18, 0x0

    goto :goto_12

    :cond_12
    move/from16 v18, p22

    :goto_12
    const/high16 v19, 0x80000

    and-int v0, v0, v19

    if-eqz v0, :cond_13

    const/16 p24, 0x0

    :goto_13
    move/from16 p16, p2

    move/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p19, v1

    move/from16 p15, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move-object/from16 p22, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p14, v11

    move-wide/from16 p12, v12

    move-wide/from16 p10, v14

    move-object/from16 p20, v16

    move-object/from16 p21, v17

    move/from16 p23, v18

    move/from16 p2, p1

    move-object/from16 p1, p0

    goto :goto_14

    :cond_13
    move/from16 p24, p23

    goto :goto_13

    :goto_14
    invoke-direct/range {p1 .. p24}, Lcom/sma/smartv3/db/entity/BloodGlucose2;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/BloodGlucose2;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/BloodGlucose2;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p24

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-wide v10, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-wide v12, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    goto :goto_8

    :cond_8
    move-wide/from16 v12, p11

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget v14, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    goto :goto_9

    :cond_9
    move/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget v2, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    goto :goto_b

    :cond_b
    move/from16 v2, p15

    :goto_b
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget v2, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    goto :goto_c

    :cond_c
    move/from16 v2, p16

    :goto_c
    move/from16 p3, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p17

    :goto_d
    move-object/from16 p4, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p18

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p19

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p24, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p20

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p24, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p21

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p24, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    goto :goto_12

    :cond_12
    move/from16 v1, p22

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p24, v16

    if-eqz v16, :cond_13

    move/from16 p8, v1

    iget v1, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    move/from16 p23, p8

    move/from16 p24, v1

    :goto_13
    move/from16 p16, p2

    move/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p19, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-wide/from16 p10, v10

    move-wide/from16 p12, v12

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_14

    :cond_13
    move/from16 p24, p23

    move/from16 p23, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p24}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->copy(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/sma/smartv3/db/entity/BloodGlucose2;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    return v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    return-wide v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    return-wide v0
.end method

.method public final component9()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    return-wide v0
.end method

.method public final copy(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/sma/smartv3/db/entity/BloodGlucose2;
    .locals 25
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
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
    .param p17    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mMeasurementId"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mUserId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mStartTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mEndTime"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mModelNo"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRiskCode"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mInsights"

    move-object/from16 v2, p18

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTips"

    move-object/from16 v3, p19

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLocaleInsights"

    move-object/from16 v4, p20

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLocaleTips"

    move-object/from16 v10, p21

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    move-wide/from16 v12, p11

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v23, p22

    move/from16 v24, p23

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v22, v10

    move/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v10, p9

    invoke-direct/range {v1 .. v24}, Lcom/sma/smartv3/db/entity/BloodGlucose2;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    if-eq v1, p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getMCompletedProgress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    return v0
.end method

.method public final getMCurrentLevel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    return v0
.end method

.method public final getMEndTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMFasting()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    return v0
.end method

.method public final getMInsights()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    return-object v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    return v0
.end method

.method public final getMLocaleInsights()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLocaleTips()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLowerBound()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    return-wide v0
.end method

.method public final getMMeasurementId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMModelNo()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    return-object v0
.end method

.method public final getMRiskCode()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getMStartTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    return-wide v0
.end method

.method public final getMTips()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    return-object v0
.end method

.method public final getMUpperBound()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    return-wide v0
.end method

.method public final getMUserId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMWithin2hrsMeal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCompletedProgress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    return-void
.end method

.method public final setMEndTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    return-void
.end method

.method public final setMFasting(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    return-void
.end method

.method public final setMLowerBound(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    return-void
.end method

.method public final setMMeasurementId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    return-void
.end method

.method public final setMModelNo(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    return-void
.end method

.method public final setMStartTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    return-void
.end method

.method public final setMUpperBound(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    return-void
.end method

.method public final setMUserId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    return-void
.end method

.method public final setMWithin2hrsMeal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 25
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mId:I

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTime:J

    iget-object v4, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mMeasurementId:Ljava/lang/String;

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUserId:Ljava/lang/String;

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mStartTime:Ljava/lang/String;

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mEndTime:Ljava/lang/String;

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mModelNo:Ljava/lang/String;

    iget-wide v9, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLowerBound:D

    iget-wide v11, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mUpperBound:D

    iget v13, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mFasting:I

    iget v14, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mWithin2hrsMeal:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCompletedProgress:I

    move/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mCurrentLevel:I

    move/from16 v17, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mRiskCode:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mInsights:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mTips:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleInsights:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mLocaleTips:Ljava/lang/String;

    move-object/from16 v22, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsSync:I

    move/from16 v23, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;->mIsDelete:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v24, v15

    const-string v15, "BloodGlucose2(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mMeasurementId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mEndTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mModelNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLowerBound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mUpperBound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mFasting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWithin2hrsMeal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCompletedProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCurrentLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRiskCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mInsights="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mTips="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLocaleInsights="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLocaleTips="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
