.class public final Lcom/sma/smartv3/db/entity/HealthyReport;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mTime"
            }
        .end subannotation
    }
.end annotation


# instance fields
.field private mAbnormalNumber:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBloodGlucose2AIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBloodGlucose2Time:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBloodGlucose2Value:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBloodOxygenAIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBloodOxygenTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBloodOxygenValue:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBloodPressureAIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBloodPressureTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDiastolicValue:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mHeartRateAIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mHeartRateTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mHeartRateValue:I
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

.field private mPressureAIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPressureTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPressureValue:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSleepAIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSleepDeepLengthTime:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSleepPiecemealTime:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSleepTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSystolicValue:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mUserGender:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mUserHeight:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mUserWeight:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeekSportsAIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWeekSportsAllTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeekSportsNumber:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeekSportsTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightAIRecords:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWeightTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeightValue:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 48

    .line 1
    const/16 v46, 0x7

    const/16 v47, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v47}, Lcom/sma/smartv3/db/entity/HealthyReport;-><init>(IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;I)V
    .locals 10
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p30    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p43    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p7

    move-object/from16 v1, p12

    move-object/from16 v2, p17

    move-object/from16 v3, p21

    move-object/from16 v4, p26

    move-object/from16 v5, p30

    move-object/from16 v6, p34

    move-object/from16 v7, p38

    move-object/from16 v8, p43

    const-string v9, "mLocalTime"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mHeartRateAIRecords"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mBloodPressureAIRecords"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mBloodOxygenAIRecords"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mSleepAIRecords"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mPressureAIRecords"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mBloodGlucose2AIRecords"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mWeightAIRecords"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "mWeekSportsAIRecords"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    .line 6
    iput p4, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    move-wide p1, p5

    .line 7
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    .line 8
    iput-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    move/from16 p1, p8

    .line 9
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    move-wide/from16 p1, p9

    .line 10
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    move/from16 p1, p11

    .line 11
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    .line 12
    iput-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    move-wide/from16 p1, p13

    .line 13
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    move/from16 p1, p15

    .line 14
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    move/from16 p1, p16

    .line 15
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    .line 16
    iput-object v2, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    move-wide/from16 p1, p18

    .line 17
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    move/from16 p1, p20

    .line 18
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    .line 19
    iput-object v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    move-wide/from16 p1, p22

    .line 20
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    move/from16 p1, p24

    .line 21
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    move/from16 p1, p25

    .line 22
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    .line 23
    iput-object v4, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    move-wide/from16 p1, p27

    .line 24
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    move/from16 p1, p29

    .line 25
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    .line 26
    iput-object v5, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    move-wide/from16 p1, p31

    .line 27
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    move/from16 p1, p33

    .line 28
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    .line 29
    iput-object v6, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    move-wide/from16 p1, p35

    .line 30
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    move/from16 p1, p37

    .line 31
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    .line 32
    iput-object v7, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    move-wide/from16 p1, p39

    .line 33
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    move/from16 p1, p41

    .line 34
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    move/from16 p1, p42

    .line 35
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    .line 36
    iput-object v8, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    move/from16 p1, p44

    .line 37
    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    return-void
.end method

.method public synthetic constructor <init>(IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 41

    move/from16 v0, p45

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/high16 v4, 0x432a0000    # 170.0f

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/high16 v5, 0x42700000    # 60.0f

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const-wide/16 v9, 0x0

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    .line 38
    const-string v11, ""

    if-eqz v6, :cond_5

    move-object v6, v11

    goto :goto_5

    :cond_5
    move-object/from16 v6, p7

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    const/4 v12, 0x0

    goto :goto_6

    :cond_6
    move/from16 v12, p8

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    const-wide/16 v13, 0x0

    goto :goto_7

    :cond_7
    move-wide/from16 v13, p9

    :goto_7
    and-int/lit16 v15, v0, 0x100

    if-eqz v15, :cond_8

    const/4 v15, 0x0

    goto :goto_8

    :cond_8
    move/from16 v15, p11

    :goto_8
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_9

    move-object v2, v11

    goto :goto_9

    :cond_9
    move-object/from16 v2, p12

    :goto_9
    and-int/lit16 v7, v0, 0x400

    if-eqz v7, :cond_a

    const-wide/16 v7, 0x0

    goto :goto_a

    :cond_a
    move-wide/from16 v7, p13

    :goto_a
    move/from16 v16, v1

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    const/4 v1, 0x0

    goto :goto_b

    :cond_b
    move/from16 v1, p15

    :goto_b
    move/from16 p3, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    const/4 v1, 0x0

    goto :goto_c

    :cond_c
    move/from16 v1, p16

    :goto_c
    move/from16 p4, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    move-object v1, v11

    goto :goto_d

    :cond_d
    move-object/from16 v1, p17

    :goto_d
    move-object/from16 p5, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const-wide/16 v17, 0x0

    goto :goto_e

    :cond_e
    move-wide/from16 v17, p18

    :goto_e
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    const/4 v1, 0x0

    goto :goto_f

    :cond_f
    move/from16 v1, p20

    :goto_f
    const/high16 v19, 0x10000

    and-int v19, v0, v19

    if-eqz v19, :cond_10

    move-object/from16 v19, v11

    goto :goto_10

    :cond_10
    move-object/from16 v19, p21

    :goto_10
    const/high16 v20, 0x20000

    and-int v20, v0, v20

    if-eqz v20, :cond_11

    const-wide/16 v20, 0x0

    goto :goto_11

    :cond_11
    move-wide/from16 v20, p22

    :goto_11
    const/high16 v22, 0x40000

    and-int v22, v0, v22

    const/16 v23, 0x0

    if-eqz v22, :cond_12

    move/from16 v22, v23

    goto :goto_12

    :cond_12
    move/from16 v22, p24

    :goto_12
    const/high16 v24, 0x80000

    and-int v24, v0, v24

    if-eqz v24, :cond_13

    move/from16 v24, v23

    goto :goto_13

    :cond_13
    move/from16 v24, p25

    :goto_13
    const/high16 v25, 0x100000

    and-int v25, v0, v25

    if-eqz v25, :cond_14

    move-object/from16 v25, v11

    goto :goto_14

    :cond_14
    move-object/from16 v25, p26

    :goto_14
    const/high16 v26, 0x200000

    and-int v26, v0, v26

    if-eqz v26, :cond_15

    const-wide/16 v26, 0x0

    goto :goto_15

    :cond_15
    move-wide/from16 v26, p27

    :goto_15
    const/high16 v28, 0x400000

    and-int v28, v0, v28

    if-eqz v28, :cond_16

    const/16 v28, 0x0

    goto :goto_16

    :cond_16
    move/from16 v28, p29

    :goto_16
    const/high16 v29, 0x800000

    and-int v29, v0, v29

    if-eqz v29, :cond_17

    move-object/from16 v29, v11

    goto :goto_17

    :cond_17
    move-object/from16 v29, p30

    :goto_17
    const/high16 v30, 0x1000000

    and-int v30, v0, v30

    if-eqz v30, :cond_18

    const-wide/16 v30, 0x0

    goto :goto_18

    :cond_18
    move-wide/from16 v30, p31

    :goto_18
    const/high16 v32, 0x2000000

    and-int v32, v0, v32

    if-eqz v32, :cond_19

    move/from16 v32, v23

    goto :goto_19

    :cond_19
    move/from16 v32, p33

    :goto_19
    const/high16 v33, 0x4000000

    and-int v33, v0, v33

    if-eqz v33, :cond_1a

    move-object/from16 v33, v11

    goto :goto_1a

    :cond_1a
    move-object/from16 v33, p34

    :goto_1a
    const/high16 v34, 0x8000000

    and-int v34, v0, v34

    if-eqz v34, :cond_1b

    const-wide/16 v34, 0x0

    goto :goto_1b

    :cond_1b
    move-wide/from16 v34, p35

    :goto_1b
    const/high16 v36, 0x10000000

    and-int v36, v0, v36

    if-eqz v36, :cond_1c

    goto :goto_1c

    :cond_1c
    move/from16 v23, p37

    :goto_1c
    const/high16 v36, 0x20000000

    and-int v36, v0, v36

    if-eqz v36, :cond_1d

    move-object/from16 v36, v11

    goto :goto_1d

    :cond_1d
    move-object/from16 v36, p38

    :goto_1d
    const/high16 v37, 0x40000000    # 2.0f

    and-int v37, v0, v37

    if-eqz v37, :cond_1e

    const-wide/16 v37, 0x0

    goto :goto_1e

    :cond_1e
    move-wide/from16 v37, p39

    :goto_1e
    const/high16 v39, -0x80000000

    and-int v0, v0, v39

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_1f
    move/from16 v0, p41

    :goto_1f
    and-int/lit8 v39, p46, 0x1

    if-eqz v39, :cond_20

    const/16 v39, 0x0

    goto :goto_20

    :cond_20
    move/from16 v39, p42

    :goto_20
    and-int/lit8 v40, p46, 0x2

    if-eqz v40, :cond_21

    goto :goto_21

    :cond_21
    move-object/from16 v11, p43

    :goto_21
    and-int/lit8 v40, p46, 0x4

    if-eqz v40, :cond_22

    const/16 p45, 0x0

    :goto_22
    move-object/from16 p1, p0

    move/from16 p16, p3

    move/from16 p17, p4

    move-object/from16 p18, p5

    move/from16 p42, v0

    move/from16 p21, v1

    move-object/from16 p13, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p8, v6

    move-wide/from16 p14, v7

    move-wide/from16 p6, v9

    move-object/from16 p44, v11

    move/from16 p9, v12

    move-wide/from16 p10, v13

    move/from16 p12, v15

    move/from16 p2, v16

    move-wide/from16 p19, v17

    move-object/from16 p22, v19

    move-wide/from16 p23, v20

    move/from16 p25, v22

    move/from16 p38, v23

    move/from16 p26, v24

    move-object/from16 p27, v25

    move-wide/from16 p28, v26

    move/from16 p30, v28

    move-object/from16 p31, v29

    move-wide/from16 p32, v30

    move/from16 p34, v32

    move-object/from16 p35, v33

    move-wide/from16 p36, v34

    move-object/from16 p39, v36

    move-wide/from16 p40, v37

    move/from16 p43, v39

    goto :goto_23

    :cond_22
    move/from16 p45, p44

    goto :goto_22

    :goto_23
    invoke-direct/range {p1 .. p45}, Lcom/sma/smartv3/db/entity/HealthyReport;-><init>(IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/HealthyReport;IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;IIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/HealthyReport;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p45

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-wide v6, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-wide v10, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget v12, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-object v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    goto :goto_a

    :cond_a
    move-wide/from16 v14, p13

    :goto_a
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    goto :goto_b

    :cond_b
    move/from16 v2, p15

    :goto_b
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    goto :goto_c

    :cond_c
    move/from16 v2, p16

    :goto_c
    move/from16 p3, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p17

    :goto_d
    move-object/from16 p4, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    goto :goto_e

    :cond_e
    move-wide/from16 v1, p18

    :goto_e
    const v16, 0x8000

    and-int v16, p45, v16

    move-wide/from16 p5, v1

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    goto :goto_f

    :cond_f
    move/from16 v1, p20

    :goto_f
    const/high16 v2, 0x10000

    and-int v2, p45, v2

    if-eqz v2, :cond_10

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v2, p21

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p45, v16

    move/from16 p7, v1

    move-object/from16 p8, v2

    if-eqz v16, :cond_11

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    goto :goto_11

    :cond_11
    move-wide/from16 v1, p22

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p45, v16

    move-wide/from16 p9, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    goto :goto_12

    :cond_12
    move/from16 v1, p24

    :goto_12
    const/high16 v2, 0x80000

    and-int v2, p45, v2

    if-eqz v2, :cond_13

    iget v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    goto :goto_13

    :cond_13
    move/from16 v2, p25

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p45, v16

    move/from16 p11, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p26

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p45, v16

    move-object/from16 p13, v1

    move/from16 p12, v2

    if-eqz v16, :cond_15

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    goto :goto_15

    :cond_15
    move-wide/from16 v1, p27

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p45, v16

    move-wide/from16 p14, v1

    if-eqz v16, :cond_16

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    goto :goto_16

    :cond_16
    move/from16 v1, p29

    :goto_16
    const/high16 v2, 0x800000

    and-int v2, p45, v2

    if-eqz v2, :cond_17

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v2, p30

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p45, v16

    move/from16 p16, v1

    move-object/from16 p17, v2

    if-eqz v16, :cond_18

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    goto :goto_18

    :cond_18
    move-wide/from16 v1, p31

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p45, v16

    move-wide/from16 p18, v1

    if-eqz v16, :cond_19

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    goto :goto_19

    :cond_19
    move/from16 v1, p33

    :goto_19
    const/high16 v2, 0x4000000

    and-int v2, p45, v2

    if-eqz v2, :cond_1a

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v2, p34

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p45, v16

    move/from16 p20, v1

    move-object/from16 p21, v2

    if-eqz v16, :cond_1b

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    goto :goto_1b

    :cond_1b
    move-wide/from16 v1, p35

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p45, v16

    move-wide/from16 p22, v1

    if-eqz v16, :cond_1c

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    goto :goto_1c

    :cond_1c
    move/from16 v1, p37

    :goto_1c
    const/high16 v2, 0x20000000

    and-int v2, p45, v2

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 v2, p38

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p45, v16

    move/from16 p24, v1

    move-object/from16 p25, v2

    if-eqz v16, :cond_1e

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    goto :goto_1e

    :cond_1e
    move-wide/from16 v1, p39

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p45, v16

    move-wide/from16 p26, v1

    if-eqz v16, :cond_1f

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    goto :goto_1f

    :cond_1f
    move/from16 v1, p41

    :goto_1f
    and-int/lit8 v2, p46, 0x1

    if-eqz v2, :cond_20

    iget v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    goto :goto_20

    :cond_20
    move/from16 v2, p42

    :goto_20
    and-int/lit8 v16, p46, 0x2

    move/from16 p28, v1

    if-eqz v16, :cond_21

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p43

    :goto_21
    and-int/lit8 v16, p46, 0x4

    if-eqz v16, :cond_22

    move-object/from16 p29, v1

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    move-object/from16 p44, p29

    move/from16 p45, v1

    :goto_22
    move/from16 p30, p16

    move-object/from16 p31, p17

    move-wide/from16 p32, p18

    move/from16 p34, p20

    move-object/from16 p35, p21

    move-wide/from16 p36, p22

    move/from16 p38, p24

    move-object/from16 p39, p25

    move-wide/from16 p40, p26

    move/from16 p42, p28

    move/from16 p43, v2

    move/from16 p16, p2

    move/from16 p17, p3

    move-object/from16 p18, p4

    move-wide/from16 p19, p5

    move/from16 p21, p7

    move-object/from16 p22, p8

    move-wide/from16 p23, p9

    move/from16 p25, p11

    move/from16 p26, p12

    move-object/from16 p27, p13

    move-wide/from16 p28, p14

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-wide/from16 p6, v6

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-wide/from16 p10, v10

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-wide/from16 p14, v14

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_23

    :cond_22
    move/from16 p45, p44

    move-object/from16 p44, v1

    goto :goto_22

    :goto_23
    invoke-virtual/range {p1 .. p45}, Lcom/sma/smartv3/db/entity/HealthyReport;->copy(IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;I)Lcom/sma/smartv3/db/entity/HealthyReport;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    return-wide v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    return v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    return-wide v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    return v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    return-wide v0
.end method

.method public final component19()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    return v0
.end method

.method public final component20()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    return v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    return-wide v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    return v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    return-wide v0
.end method

.method public final component26()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    return v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    return-wide v0
.end method

.method public final component29()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    return v0
.end method

.method public final component30()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component31()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    return-wide v0
.end method

.method public final component32()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    return v0
.end method

.method public final component33()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    return v0
.end method

.method public final component34()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final component35()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    return v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    return-wide v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    return v0
.end method

.method public final copy(IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;I)Lcom/sma/smartv3/db/entity/HealthyReport;
    .locals 46
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p30    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p43    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mHeartRateAIRecords"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBloodPressureAIRecords"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBloodOxygenAIRecords"

    move-object/from16 v2, p21

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSleepAIRecords"

    move-object/from16 v3, p26

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPressureAIRecords"

    move-object/from16 v4, p30

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBloodGlucose2AIRecords"

    move-object/from16 v5, p34

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeightAIRecords"

    move-object/from16 v6, p38

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mWeekSportsAIRecords"

    move-object/from16 v7, p43

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/HealthyReport;

    move/from16 v9, p8

    move-wide/from16 v10, p9

    move/from16 v12, p11

    move-wide/from16 v14, p13

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-wide/from16 v19, p18

    move/from16 v21, p20

    move-wide/from16 v23, p22

    move/from16 v25, p24

    move/from16 v26, p25

    move-wide/from16 v28, p27

    move/from16 v30, p29

    move-wide/from16 v32, p31

    move/from16 v34, p33

    move-wide/from16 v36, p35

    move/from16 v38, p37

    move-wide/from16 v40, p39

    move/from16 v42, p41

    move/from16 v43, p42

    move/from16 v45, p44

    move-object/from16 v22, v2

    move-object/from16 v27, v3

    move-object/from16 v31, v4

    move-object/from16 v35, v5

    move-object/from16 v39, v6

    move-object/from16 v44, v7

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    invoke-direct/range {v1 .. v45}, Lcom/sma/smartv3/db/entity/HealthyReport;-><init>(IIFFJLjava/lang/String;IJILjava/lang/String;JIILjava/lang/String;JILjava/lang/String;JFFLjava/lang/String;JILjava/lang/String;JFLjava/lang/String;JFLjava/lang/String;JIILjava/lang/String;I)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/HealthyReport;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/HealthyReport;

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    if-eq v1, p1, :cond_24

    return v2

    :cond_24
    return v0
.end method

.method public final getMAbnormalNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    return v0
.end method

.method public final getMBloodGlucose2AIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMBloodGlucose2Time()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    return-wide v0
.end method

.method public final getMBloodGlucose2Value()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    return v0
.end method

.method public final getMBloodOxygenAIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMBloodOxygenTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    return-wide v0
.end method

.method public final getMBloodOxygenValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    return v0
.end method

.method public final getMBloodPressureAIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMBloodPressureTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    return-wide v0
.end method

.method public final getMDiastolicValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    return v0
.end method

.method public final getMHeartRateAIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMHeartRateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    return-wide v0
.end method

.method public final getMHeartRateValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMPressureAIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMPressureTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    return-wide v0
.end method

.method public final getMPressureValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    return v0
.end method

.method public final getMSleepAIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMSleepDeepLengthTime()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    return v0
.end method

.method public final getMSleepPiecemealTime()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    return v0
.end method

.method public final getMSleepTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    return-wide v0
.end method

.method public final getMSystolicValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    return-wide v0
.end method

.method public final getMUserGender()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    return v0
.end method

.method public final getMUserHeight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    return v0
.end method

.method public final getMUserWeight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    return v0
.end method

.method public final getMWeekSportsAIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMWeekSportsAllTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    return v0
.end method

.method public final getMWeekSportsNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    return v0
.end method

.method public final getMWeekSportsTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    return-wide v0
.end method

.method public final getMWeightAIRecords()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    return-object v0
.end method

.method public final getMWeightTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    return-wide v0
.end method

.method public final getMWeightValue()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAbnormalNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    return-void
.end method

.method public final setMBloodGlucose2AIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMBloodGlucose2Time(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    return-void
.end method

.method public final setMBloodGlucose2Value(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    return-void
.end method

.method public final setMBloodOxygenAIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMBloodOxygenTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    return-void
.end method

.method public final setMBloodOxygenValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    return-void
.end method

.method public final setMBloodPressureAIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMBloodPressureTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    return-void
.end method

.method public final setMDiastolicValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    return-void
.end method

.method public final setMHeartRateAIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMHeartRateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    return-void
.end method

.method public final setMHeartRateValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

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

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMPressureAIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMPressureTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    return-void
.end method

.method public final setMPressureValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    return-void
.end method

.method public final setMSleepAIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMSleepDeepLengthTime(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    return-void
.end method

.method public final setMSleepPiecemealTime(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    return-void
.end method

.method public final setMSleepTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    return-void
.end method

.method public final setMSystolicValue(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    return-void
.end method

.method public final setMUserGender(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    return-void
.end method

.method public final setMUserHeight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    return-void
.end method

.method public final setMUserWeight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    return-void
.end method

.method public final setMWeekSportsAIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMWeekSportsAllTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    return-void
.end method

.method public final setMWeekSportsNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    return-void
.end method

.method public final setMWeekSportsTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    return-void
.end method

.method public final setMWeightAIRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    return-void
.end method

.method public final setMWeightTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    return-void
.end method

.method public final setMWeightValue(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 46
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mId:I

    iget v2, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserGender:I

    iget v3, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserWeight:F

    iget v4, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mUserHeight:F

    iget-wide v5, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mTime:J

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mLocalTime:Ljava/lang/String;

    iget v8, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mAbnormalNumber:I

    iget-wide v9, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateTime:J

    iget v11, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateValue:I

    iget-object v12, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mHeartRateAIRecords:Ljava/lang/String;

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureTime:J

    iget v15, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSystolicValue:I

    move/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mDiastolicValue:I

    move/from16 v17, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodPressureAIRecords:Ljava/lang/String;

    move-wide/from16 v18, v13

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenTime:J

    move-wide/from16 v20, v13

    iget v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenValue:I

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodOxygenAIRecords:Ljava/lang/String;

    move/from16 v22, v13

    move-object/from16 v23, v14

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepTime:J

    move-wide/from16 v24, v13

    iget v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepDeepLengthTime:F

    iget v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepPiecemealTime:F

    move/from16 v26, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mSleepAIRecords:Ljava/lang/String;

    move/from16 v27, v13

    move-object/from16 v28, v14

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureTime:J

    move-wide/from16 v29, v13

    iget v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureValue:I

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mPressureAIRecords:Ljava/lang/String;

    move/from16 v31, v13

    move-object/from16 v32, v14

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Time:J

    move-wide/from16 v33, v13

    iget v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2Value:F

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mBloodGlucose2AIRecords:Ljava/lang/String;

    move/from16 v35, v13

    move-object/from16 v36, v14

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightTime:J

    move-wide/from16 v37, v13

    iget v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightValue:F

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeightAIRecords:Ljava/lang/String;

    move/from16 v39, v13

    move-object/from16 v40, v14

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsTime:J

    move-wide/from16 v41, v13

    iget v13, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsNumber:I

    iget v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAllTime:I

    move/from16 v43, v14

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mWeekSportsAIRecords:Ljava/lang/String;

    move-object/from16 v44, v14

    iget v14, v0, Lcom/sma/smartv3/db/entity/HealthyReport;->mIsSync:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v45, v14

    const-string v14, "HealthyReport(mId="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUserGender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUserWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mUserHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mAbnormalNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeartRateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mHeartRateValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeartRateAIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodPressureTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v18

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mSystolicValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDiastolicValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodPressureAIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodOxygenTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodOxygenValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodOxygenAIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mSleepTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v24

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mSleepDeepLengthTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mSleepPiecemealTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mSleepAIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mPressureTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v29

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mPressureValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPressureAIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodGlucose2Time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v33

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodGlucose2Value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mBloodGlucose2AIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v37

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mWeightAIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeekSportsTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v41

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mWeekSportsNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWeekSportsAllTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWeekSportsAIRecords="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
