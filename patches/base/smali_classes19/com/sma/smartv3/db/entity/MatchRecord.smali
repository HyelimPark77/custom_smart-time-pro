.class public final Lcom/sma/smartv3/db/entity/MatchRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mStart"
            }
        .end subannotation
    }
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lcom/sma/smartv3/db/entity/MatchRecordConverter;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMatchRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchRecord.kt\ncom/sma/smartv3/db/entity/MatchRecord\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1563#2:214\n1634#2,3:215\n1563#2:218\n1634#2,3:219\n1563#2:222\n1634#2,3:223\n1563#2:226\n1634#2,3:227\n1869#2,2:230\n1563#2:232\n1634#2,3:233\n1563#2:236\n1634#2,3:237\n1869#2,2:240\n1869#2,2:242\n*S KotlinDebug\n*F\n+ 1 MatchRecord.kt\ncom/sma/smartv3/db/entity/MatchRecord\n*L\n106#1:214\n106#1:215,3\n107#1:218\n107#1:219,3\n117#1:222\n117#1:223,3\n118#1:226\n118#1:227,3\n127#1:230,2\n147#1:232\n147#1:233,3\n148#1:236\n148#1:237,3\n171#1:240,2\n190#1:242,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMatchRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchRecord.kt\ncom/sma/smartv3/db/entity/MatchRecord\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1563#2:214\n1634#2,3:215\n1563#2:218\n1634#2,3:219\n1563#2:222\n1634#2,3:223\n1563#2:226\n1634#2,3:227\n1869#2,2:230\n1563#2:232\n1634#2,3:233\n1563#2:236\n1634#2,3:237\n1869#2,2:240\n1869#2,2:242\n*S KotlinDebug\n*F\n+ 1 MatchRecord.kt\ncom/sma/smartv3/db/entity/MatchRecord\n*L\n106#1:214\n106#1:215,3\n107#1:218\n107#1:219,3\n117#1:222\n117#1:223,3\n118#1:226\n118#1:227,3\n127#1:230,2\n147#1:232\n147#1:233,3\n148#1:236\n148#1:237,3\n171#1:240,2\n190#1:242,2\n*E\n"
    }
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

.field private mGuestTeamScore:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mHomeTeamScore:I
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

.field private mIsStopWatchData:I
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

.field private mLogList:Ljava/util/List;
    .annotation build Landroidx/room/Ignore;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;"
        }
    .end annotation
.end field

.field private mLogListSize:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxSpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinBpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinSpm:I
    .annotation build Landroidx/room/ColumnInfo;
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

.field private mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;
    .annotation build Landroidx/room/Embedded;
        prefix = "p_"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPeriodList:Ljava/util/List;
    .annotation build Landroidx/room/Ignore;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private mPeriodListSize:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSource:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStart:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStopWatchList:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mWeather:Lcom/szabh/smable3/entity/BleWeather;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 34

    .line 1
    const v32, 0x3fffffff    # 1.9999999f

    const/16 v33, 0x0

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v33}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIII)V
    .locals 1
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Lcom/sma/smartv3/db/entity/MatchPeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p16    # Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p17    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/String;",
            "III",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            "II",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/szabh/smable3/entity/BleMatchRecordTeam3;",
            "Lcom/szabh/smable3/entity/BleWeather;",
            "IIIIIIIIIIIIII)V"
        }
    .end annotation

    const-string v0, "mLocalTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPeriod"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPeriodList"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLogList"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    .line 7
    iput p6, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    .line 8
    iput p7, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    .line 9
    iput-object p8, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    .line 10
    iput p9, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    .line 11
    iput p10, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    .line 12
    iput-object p11, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    .line 13
    iput-object p12, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    .line 14
    iput p13, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    move p1, p14

    .line 15
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    move/from16 p1, p18

    .line 19
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    move/from16 p1, p19

    .line 20
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    move/from16 p1, p20

    .line 21
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    move/from16 p1, p21

    .line 22
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    move/from16 p1, p22

    .line 23
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    move/from16 p1, p23

    .line 24
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    move/from16 p1, p24

    .line 25
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    move/from16 p1, p25

    .line 26
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    move/from16 p1, p26

    .line 27
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    move/from16 p1, p27

    .line 28
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    move/from16 p1, p28

    .line 29
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    move/from16 p1, p29

    .line 30
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    move/from16 p1, p30

    .line 31
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    move/from16 p1, p31

    .line 32
    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 31

    move/from16 v0, p32

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

    .line 33
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

    .line 34
    new-instance v10, Lcom/sma/smartv3/db/entity/MatchPeriod;

    const/16 v23, 0xfff

    const/16 v24, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

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

    invoke-direct/range {v10 .. v24}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move/from16 v9, p9

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

    .line 35
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    .line 36
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

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

    const/16 v16, 0x0

    if-eqz v2, :cond_d

    move-object/from16 v2, v16

    goto :goto_d

    :cond_d
    move-object/from16 v2, p15

    :goto_d
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    move-object/from16 v1, v16

    goto :goto_e

    :cond_e
    move-object/from16 v1, p16

    :goto_e
    const v17, 0x8000

    and-int v17, v0, v17

    if-eqz v17, :cond_f

    goto :goto_f

    :cond_f
    move-object/from16 v16, p17

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move/from16 v17, p18

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move/from16 v18, p19

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move/from16 v19, p20

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move/from16 v20, p21

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    const/16 v21, 0x0

    goto :goto_14

    :cond_14
    move/from16 v21, p22

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    const/16 v22, 0x0

    goto :goto_15

    :cond_15
    move/from16 v22, p23

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    const/16 v23, 0x0

    goto :goto_16

    :cond_16
    move/from16 v23, p24

    :goto_16
    const/high16 v24, 0x800000

    and-int v24, v0, v24

    if-eqz v24, :cond_17

    const/16 v24, 0x0

    goto :goto_17

    :cond_17
    move/from16 v24, p25

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_18

    const/16 v25, 0x0

    goto :goto_18

    :cond_18
    move/from16 v25, p26

    :goto_18
    const/high16 v26, 0x2000000

    and-int v26, v0, v26

    if-eqz v26, :cond_19

    const/16 v26, 0x0

    goto :goto_19

    :cond_19
    move/from16 v26, p27

    :goto_19
    const/high16 v27, 0x4000000

    and-int v27, v0, v27

    if-eqz v27, :cond_1a

    const/16 v27, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v27, p28

    :goto_1a
    const/high16 v28, 0x8000000

    and-int v28, v0, v28

    if-eqz v28, :cond_1b

    const/16 v28, 0x0

    goto :goto_1b

    :cond_1b
    move/from16 v28, p29

    :goto_1b
    const/high16 v29, 0x10000000

    and-int v29, v0, v29

    if-eqz v29, :cond_1c

    const/16 v29, 0x0

    goto :goto_1c

    :cond_1c
    move/from16 v29, p30

    :goto_1c
    const/high16 v30, 0x20000000

    and-int v0, v0, v30

    if-eqz v0, :cond_1d

    const/16 p32, 0x0

    :goto_1d
    move/from16 p2, p1

    move-object/from16 p17, v1

    move-object/from16 p16, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p10, v9

    move-object/from16 p9, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p18, v16

    move/from16 p19, v17

    move/from16 p20, v18

    move/from16 p21, v19

    move/from16 p22, v20

    move/from16 p23, v21

    move/from16 p24, v22

    move/from16 p25, v23

    move/from16 p26, v24

    move/from16 p27, v25

    move/from16 p28, v26

    move/from16 p29, v27

    move/from16 p30, v28

    move/from16 p31, v29

    move-object/from16 p1, p0

    goto :goto_1e

    :cond_1d
    move/from16 p32, p31

    goto :goto_1d

    .line 37
    :goto_1e
    invoke-direct/range {p1 .. p32}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIII)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchRecord2;J)V
    .locals 34
    .param p1    # Lcom/szabh/smable3/entity/BleMatchRecord2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-wide/from16 v0, p2

    const-string v2, "bleMatchRecord"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMStart()I

    move-result v2

    const v4, 0x386d4380

    add-int/2addr v2, v4

    int-to-long v4, v2

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    sub-long/2addr v4, v0

    move-wide v2, v4

    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMType()I

    move-result v5

    .line 58
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMPeriodListSize()I

    move-result v6

    .line 59
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMLogListSize()I

    move-result v7

    .line 60
    new-instance v8, Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMPeriod()Lcom/szabh/smable3/entity/BleMatchPeriod2;

    move-result-object v4

    invoke-direct {v8, v4, v0, v1}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(Lcom/szabh/smable3/entity/BleMatchPeriod2;J)V

    .line 61
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMPeriodList()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 62
    new-instance v11, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 64
    check-cast v10, Lcom/szabh/smable3/entity/BleMatchPeriod2;

    .line 65
    new-instance v12, Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-direct {v12, v10, v0, v1}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(Lcom/szabh/smable3/entity/BleMatchPeriod2;J)V

    .line 66
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMLogList()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 68
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v12, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 70
    check-cast v9, Lcom/szabh/smable3/entity/BleMatchLog2;

    .line 71
    new-instance v10, Lcom/sma/smartv3/db/entity/MatchLog;

    invoke-direct {v10, v9, v0, v1}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(Lcom/szabh/smable3/entity/BleMatchLog2;J)V

    .line 72
    invoke-interface {v12, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMIsStopWatchData()I

    move-result v14

    .line 74
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMStopWatchList()Ljava/util/List;

    move-result-object v15

    .line 75
    new-instance v0, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMTeamInfo()Lcom/szabh/smable3/entity/BleMatchRecordTeam;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;-><init>(Lcom/szabh/smable3/entity/BleMatchRecordTeam;)V

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleMatchRecord2;->getMWeather()Lcom/szabh/smable3/entity/BleWeather;

    move-result-object v17

    const v32, 0x3fff0185

    const/16 v33, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    .line 77
    invoke-direct/range {v0 .. v33}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 78
    iget-object v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IOOIXiI1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 79
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/16 v2, 0xff

    :goto_2
    move v3, v2

    :cond_2
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/MatchLog;

    .line 80
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_3

    .line 81
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCancelType()I

    move-result v3

    goto :goto_3

    .line 82
    :cond_3
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v5

    if-ne v5, v3, :cond_4

    goto :goto_2

    .line 83
    :cond_4
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v5

    const/4 v6, 0x6

    if-ne v5, v6, :cond_5

    iget v5, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    if-nez v5, :cond_5

    .line 84
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCount()I

    move-result v4

    iput v4, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    goto :goto_3

    .line 85
    :cond_5
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v5

    const/4 v6, 0x7

    if-ne v5, v6, :cond_2

    iget v5, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    if-nez v5, :cond_2

    .line 86
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCount()I

    move-result v4

    iput v4, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    goto :goto_3

    :cond_6
    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchRecord3;J)V
    .locals 40
    .param p1    # Lcom/szabh/smable3/entity/BleMatchRecord3;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-wide/from16 v0, p2

    const-string v2, "bleMatchRecord"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMStart()I

    move-result v2

    const v4, 0x386d4380

    add-int/2addr v2, v4

    int-to-long v4, v2

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    sub-long v8, v4, v0

    .line 88
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMType()I

    move-result v11

    .line 89
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMPeriodListSize()I

    move-result v12

    .line 90
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMLogListSize()I

    move-result v13

    .line 91
    new-instance v14, Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMPeriod()Lcom/szabh/smable3/entity/BleMatchPeriod2;

    move-result-object v2

    invoke-direct {v14, v2, v0, v1}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(Lcom/szabh/smable3/entity/BleMatchPeriod2;J)V

    .line 92
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMPeriodList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 93
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 95
    check-cast v6, Lcom/szabh/smable3/entity/BleMatchPeriod2;

    .line 96
    new-instance v7, Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-direct {v7, v6, v0, v1}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(Lcom/szabh/smable3/entity/BleMatchPeriod2;J)V

    .line 97
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMLogList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 99
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 101
    check-cast v5, Lcom/szabh/smable3/entity/BleMatchLog3;

    .line 102
    new-instance v7, Lcom/sma/smartv3/db/entity/MatchLog;

    invoke-direct {v7, v5, v0, v1}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(Lcom/szabh/smable3/entity/BleMatchLog3;J)V

    .line 103
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 104
    :cond_1
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMIsStopWatchData()I

    move-result v20

    .line 105
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMStopWatchList()Ljava/util/List;

    move-result-object v21

    .line 106
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMTeamInfo()Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    move-result-object v22

    .line 107
    new-instance v23, Lcom/szabh/smable3/entity/BleWeather;

    const/16 v33, 0x1ff

    const/16 v34, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v23 .. v34}, Lcom/szabh/smable3/entity/BleWeather;-><init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v23

    .line 108
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMWeather()Lcom/szabh/smable3/entity/BleWeather2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather2;->getMWeatherCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleWeather;->setMWeatherCode(I)V

    .line 109
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMWeather()Lcom/szabh/smable3/entity/BleWeather2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather2;->getMCurrentTemperature()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleWeather;->setMCurrentTemperature(I)V

    .line 110
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMWeather()Lcom/szabh/smable3/entity/BleWeather2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather2;->getMMaxTemperature()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleWeather;->setMMaxTemperature(I)V

    .line 111
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMWeather()Lcom/szabh/smable3/entity/BleWeather2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather2;->getMMinTemperature()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleWeather;->setMMinTemperature(I)V

    const v38, 0x3fff0185

    const/16 v39, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x2

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v17, v4

    move-object/from16 v18, v6

    move-object/from16 v6, p0

    .line 112
    invoke-direct/range {v6 .. v39}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 113
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord3;->getMType()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 114
    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/MatchRecord;->rugbyTotalScore()V

    return-void

    .line 115
    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/MatchRecord;->normalTotalScore()V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleMatchRecord;J)V
    .locals 40
    .param p1    # Lcom/szabh/smable3/entity/BleMatchRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-wide/from16 v0, p2

    const-string v2, "bleMatchRecord"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord;->getMStart()I

    move-result v2

    const v4, 0x386d4380

    add-int/2addr v2, v4

    int-to-long v4, v2

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    sub-long v8, v4, v0

    .line 39
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord;->getMType()I

    move-result v11

    .line 40
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord;->getMPeriodListSize()I

    move-result v12

    .line 41
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord;->getMLogListSize()I

    move-result v13

    .line 42
    new-instance v14, Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord;->getMPeriod()Lcom/szabh/smable3/entity/BleMatchPeriod;

    move-result-object v2

    invoke-direct {v14, v2, v0, v1}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(Lcom/szabh/smable3/entity/BleMatchPeriod;J)V

    .line 43
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord;->getMPeriodList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 44
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 46
    check-cast v6, Lcom/szabh/smable3/entity/BleMatchPeriod;

    .line 47
    new-instance v7, Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-direct {v7, v6, v0, v1}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(Lcom/szabh/smable3/entity/BleMatchPeriod;J)V

    .line 48
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleMatchRecord;->getMLogList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 50
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 52
    check-cast v5, Lcom/szabh/smable3/entity/BleMatchLog;

    .line 53
    new-instance v6, Lcom/sma/smartv3/db/entity/MatchLog;

    invoke-direct {v6, v5, v0, v1}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(Lcom/szabh/smable3/entity/BleMatchLog;J)V

    .line 54
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const v38, 0x3ffff985    # 1.9998022f

    const/16 v39, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v6, p0

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    .line 55
    invoke-direct/range {v6 .. v39}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/MatchRecord;IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/MatchRecord;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p32

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p15

    :goto_d
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p32, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p32, v16

    move/from16 p4, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    goto :goto_11

    :cond_11
    move/from16 v1, p19

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p32, v16

    move/from16 p5, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    goto :goto_12

    :cond_12
    move/from16 v1, p20

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p32, v16

    move/from16 p6, v1

    if-eqz v16, :cond_13

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    goto :goto_13

    :cond_13
    move/from16 v1, p21

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p32, v16

    move/from16 p7, v1

    if-eqz v16, :cond_14

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    goto :goto_14

    :cond_14
    move/from16 v1, p22

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p32, v16

    move/from16 p8, v1

    if-eqz v16, :cond_15

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    goto :goto_15

    :cond_15
    move/from16 v1, p23

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p32, v16

    move/from16 p9, v1

    if-eqz v16, :cond_16

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    goto :goto_16

    :cond_16
    move/from16 v1, p24

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p32, v16

    move/from16 p10, v1

    if-eqz v16, :cond_17

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    goto :goto_17

    :cond_17
    move/from16 v1, p25

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p32, v16

    move/from16 p11, v1

    if-eqz v16, :cond_18

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    goto :goto_18

    :cond_18
    move/from16 v1, p26

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p32, v16

    move/from16 p12, v1

    if-eqz v16, :cond_19

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    goto :goto_19

    :cond_19
    move/from16 v1, p27

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p32, v16

    move/from16 p13, v1

    if-eqz v16, :cond_1a

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    goto :goto_1a

    :cond_1a
    move/from16 v1, p28

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p32, v16

    move/from16 p14, v1

    if-eqz v16, :cond_1b

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    goto :goto_1b

    :cond_1b
    move/from16 v1, p29

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p32, v16

    move/from16 p15, v1

    if-eqz v16, :cond_1c

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    goto :goto_1c

    :cond_1c
    move/from16 v1, p30

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p32, v16

    if-eqz v16, :cond_1d

    move/from16 p16, v1

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    move/from16 p31, p16

    move/from16 p32, v1

    move-object/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move/from16 p22, p7

    move/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move/from16 p26, p11

    move/from16 p27, p12

    move/from16 p28, p13

    move/from16 p29, p14

    move/from16 p30, p15

    move-object/from16 p17, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p16, p2

    :goto_1d
    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1e

    :cond_1d
    move/from16 p32, p31

    move/from16 p31, v1

    move-object/from16 p16, p2

    move-object/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move/from16 p22, p7

    move/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move/from16 p26, p11

    move/from16 p27, p12

    move/from16 p28, p13

    move/from16 p29, p14

    move/from16 p30, p15

    move-object/from16 p17, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    goto :goto_1d

    :goto_1e
    invoke-virtual/range {p1 .. p32}, Lcom/sma/smartv3/db/entity/MatchRecord;->copy(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIII)Lcom/sma/smartv3/db/entity/MatchRecord;

    move-result-object v0

    return-object v0
.end method

.method private final normalTotalScore()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IOOIXiI1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v1, 0xff

    :goto_0
    move v2, v1

    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/MatchLog;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCancelType()I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v4

    if-ne v4, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v4

    const/4 v5, 0x6

    if-ne v4, v5, :cond_3

    iget v4, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    if-nez v4, :cond_3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCount()I

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v4

    const/4 v5, 0x7

    if-ne v4, v5, :cond_0

    iget v4, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCount()I

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    return v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    return v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    return-object v0
.end method

.method public final component16()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    return-wide v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    return v0
.end method

.method public final component26()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    return v0
.end method

.method public final component27()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    return v0
.end method

.method public final component28()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    return v0
.end method

.method public final component29()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    return v0
.end method

.method public final component7()Lcom/sma/smartv3/db/entity/MatchPeriod;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    return v0
.end method

.method public final copy(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIII)Lcom/sma/smartv3/db/entity/MatchRecord;
    .locals 33
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Lcom/sma/smartv3/db/entity/MatchPeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p16    # Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p17    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/String;",
            "III",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            "II",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/szabh/smable3/entity/BleMatchRecordTeam3;",
            "Lcom/szabh/smable3/entity/BleWeather;",
            "IIIIIIIIIIIIII)",
            "Lcom/sma/smartv3/db/entity/MatchRecord;"
        }
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPeriod"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPeriodList"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLogList"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/MatchRecord;

    move/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move/from16 v26, p25

    move/from16 v27, p26

    move/from16 v28, p27

    move/from16 v29, p28

    move/from16 v30, p29

    move/from16 v31, p30

    move/from16 v32, p31

    invoke-direct/range {v1 .. v32}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>(IJLjava/lang/String;IIILcom/sma/smartv3/db/entity/MatchPeriod;IILjava/util/List;Ljava/util/List;IILjava/util/List;Lcom/szabh/smable3/entity/BleMatchRecordTeam3;Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIIIIII)V

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
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/MatchRecord;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/MatchRecord;

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    if-eq v1, p1, :cond_1f

    return v2

    :cond_1f
    return v0
.end method

.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    return v0
.end method

.method public final getMGuestTeamScore()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    return v0
.end method

.method public final getMHomeTeamScore()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    return v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    return v0
.end method

.method public final getMIsStopWatchData()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLogList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    return-object v0
.end method

.method public final getMLogListSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    return v0
.end method

.method public final getMMaxAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    return v0
.end method

.method public final getMMaxPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    return v0
.end method

.method public final getMMaxSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    return v0
.end method

.method public final getMMinAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    return v0
.end method

.method public final getMMinBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    return v0
.end method

.method public final getMMinPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    return v0
.end method

.method public final getMMinSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    return v0
.end method

.method public final getMPeriod()Lcom/sma/smartv3/db/entity/MatchPeriod;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    return-object v0
.end method

.method public final getMPeriodList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    return-object v0
.end method

.method public final getMPeriodListSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    return v0
.end method

.method public final getMSource()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    return v0
.end method

.method public final getMStart()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    return-wide v0
.end method

.method public final getMStopWatchList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    return-object v0
.end method

.method public final getMTeamInfo()Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    return-object v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    return v0
.end method

.method public final getMWeather()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/MatchPeriod;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleMatchRecordTeam3;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final rugbyTotalScore()V
    .locals 9

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1, v1}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IOOIXiI1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/16 v3, 0xff

    :goto_0
    move v4, v3

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/MatchLog;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCancelType()I

    move-result v4

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v7

    if-ne v7, v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v7

    const/16 v8, 0x11

    if-eq v7, v8, :cond_3

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v7

    const/16 v8, 0x12

    if-eq v7, v8, :cond_3

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v7

    const/16 v8, 0x13

    if-eq v7, v8, :cond_3

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v7

    const/16 v8, 0x14

    if-eq v7, v8, :cond_3

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMType()I

    move-result v7

    const/16 v8, 0x15

    if-ne v7, v8, :cond_0

    :cond_3
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMTeam()I

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMTeam()I

    move-result v7

    if-ne v7, v6, :cond_0

    :cond_4
    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMTeam()I

    move-result v6

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMTeam()I

    move-result v6

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/MatchLog;->getMCount()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v6, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    return-void
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    return-void
.end method

.method public final setMGuestTeamScore(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    return-void
.end method

.method public final setMHomeTeamScore(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    return-void
.end method

.method public final setMId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    return-void
.end method

.method public final setMIsStopWatchData(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

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

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMLogList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    return-void
.end method

.method public final setMLogListSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    return-void
.end method

.method public final setMMaxAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    return-void
.end method

.method public final setMMaxPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    return-void
.end method

.method public final setMMaxSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    return-void
.end method

.method public final setMMinAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    return-void
.end method

.method public final setMMinBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    return-void
.end method

.method public final setMMinPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    return-void
.end method

.method public final setMMinSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    return-void
.end method

.method public final setMPeriod(Lcom/sma/smartv3/db/entity/MatchPeriod;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/entity/MatchPeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    return-void
.end method

.method public final setMPeriodList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    return-void
.end method

.method public final setMPeriodListSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    return-void
.end method

.method public final setMSource(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    return-void
.end method

.method public final setMStart(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    return-void
.end method

.method public final setMStopWatchList(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    return-void
.end method

.method public final setMTeamInfo(Lcom/szabh/smable3/entity/BleMatchRecordTeam3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleMatchRecordTeam3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    return-void
.end method

.method public final setMWeather(Lcom/szabh/smable3/entity/BleWeather;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 33
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mId:I

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStart:J

    iget-object v4, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLocalTime:Ljava/lang/String;

    iget v5, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mType:I

    iget v6, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodListSize:I

    iget v7, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogListSize:I

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriod:Lcom/sma/smartv3/db/entity/MatchPeriod;

    iget v9, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsSync:I

    iget v10, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsDelete:I

    iget-object v11, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPeriodList:Ljava/util/List;

    iget-object v12, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mLogList:Ljava/util/List;

    iget v13, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSource:I

    iget v14, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mIsStopWatchData:I

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mStopWatchList:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mTeamInfo:Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    move-object/from16 v18, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mHomeTeamScore:I

    move/from16 v19, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mGuestTeamScore:I

    move/from16 v20, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMode:I

    move/from16 v21, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinBpm:I

    move/from16 v22, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAirPressure:I

    move/from16 v23, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mPace:I

    move/from16 v24, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxPace:I

    move/from16 v25, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinPace:I

    move/from16 v26, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mSpm:I

    move/from16 v27, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxSpm:I

    move/from16 v28, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinSpm:I

    move/from16 v29, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mAltitude:I

    move/from16 v30, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMaxAltitude:I

    move/from16 v31, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/MatchRecord;->mMinAltitude:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v32, v15

    const-string v15, "MatchRecord(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodListSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLogListSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLogList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsStopWatchData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStopWatchList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mTeamInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeather="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mHomeTeamScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGuestTeamScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAirPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
