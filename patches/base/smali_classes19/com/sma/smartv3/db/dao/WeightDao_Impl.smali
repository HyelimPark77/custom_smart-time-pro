.class public final Lcom/sma/smartv3/db/dao/WeightDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/WeightDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfWeight:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation
.end field

.field private final __listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

.field private final __updateAdapterOfWeight:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "__db"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-direct {v0}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__insertAdapterOfWeight:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/WeightDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/WeightDao_Impl$2;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__updateAdapterOfWeight:Landroidx/room/EntityDeleteOrUpdateAdapter;

    return-void
.end method

.method public static bridge synthetic I0IIOi(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)Lcom/sma/smartv3/db/entity/ListDoubleConverter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/db/dao/WeightDao_Impl;JJLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 134

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT * FROM Weight WHERE mTime >= ? AND mTime < ? AND mIsDelete != 1 ORDER BY mTime ASC"

    move-object/from16 v2, p5

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v2, 0x1

    move-wide/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v2, 0x2

    move-wide/from16 v3, p3

    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const-string v2, "mId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mWeight"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mIsMeasure"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mBmi"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mRatioOfFat"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mWeightOfMuscle"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mWeightOfFat"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mRatioOfProtein"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mRatioOfWater"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mStateOfNutrition"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIdealWeight"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    const-string v0, "mAgeOfBody"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p1, v0

    const-string v0, "mAgeOfBodyRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p2, v0

    const-string v0, "mBmiRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p3, v0

    const-string v0, "mBmiWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p4, v0

    const-string v0, "mBmr"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p5, v0

    const-string v0, "mBmrRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v16, v0

    const-string v0, "mBodyShape"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v17, v0

    const-string v0, "mDesirableWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    const-string v0, "mFatFreeBodyWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v19, v0

    const-string v0, "mFatToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    const-string v0, "mLevelOfVisceralFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v21, v0

    const-string v0, "mLevelOfVisceralFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v22, v0

    const-string v0, "mMuscleToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v23, v0

    const-string v0, "mRatioOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v0

    const-string v0, "mRatioOfMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v25, v0

    const-string v0, "mRatioOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v26, v0

    const-string v0, "mRatioOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v27, v0

    const-string v0, "mRatioOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v28, v0

    const-string v0, "mRatioOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v29, v0

    const-string v0, "mRatioOfSubcutaneousFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v30, v0

    const-string v0, "mRatioOfSubcutaneousFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v31, v0

    const-string v0, "mRatioOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v32, v0

    const-string v0, "mScore"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v33, v0

    const-string v0, "mWeightOfBone"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v34, v0

    const-string v0, "mWeightOfBoneRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v35, v0

    const-string v0, "mWeightOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v36, v0

    const-string v0, "mWeightOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v37, v0

    const-string v0, "mWeightOfProtein"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v38, v0

    const-string v0, "mWeightOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v39, v0

    const-string v0, "mWeightOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v40, v0

    const-string v0, "mWeightOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v41, v0

    const-string v0, "mWeightOfWater"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v42, v0

    const-string v0, "mWeightOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v43, v0

    const-string v0, "mWeightRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v44, v0

    const-string v0, "mWeightToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v45, v0

    const-string v0, "mWeightWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v46, v0

    const-string v0, "mIsDelete"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v47, v0

    const-string v0, "mRatioOfProteinLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v48, v0

    const-string v0, "mRatioOfWaterLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v49, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v50

    if-eqz v50, :cond_14

    move/from16 v50, v14

    move/from16 v51, v15

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v54

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v15

    const/16 v52, 0x0

    if-eqz v15, :cond_0

    move-object/from16 v56, v52

    move v15, v2

    move/from16 v132, v3

    goto :goto_1

    :cond_0
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v56, v15

    move/from16 v132, v3

    move v15, v2

    :goto_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    move/from16 v57, v2

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v58, v2

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v60

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v62

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v64

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v66

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v68

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v70

    move/from16 v3, v50

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v72

    move/from16 v59, v2

    move/from16 v2, v51

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v74

    move/from16 v51, v2

    move/from16 v2, p1

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v76

    move/from16 p1, v2

    move/from16 v2, p2

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v50

    if-eqz v50, :cond_1

    move/from16 p2, v2

    move-object/from16 v2, v52

    move/from16 v50, v3

    move/from16 v133, v4

    :goto_2
    move-object/from16 v3, p0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v50

    move/from16 p2, v2

    move-object/from16 v2, v50

    move/from16 v133, v4

    move/from16 v50, v3

    goto :goto_2

    :goto_3
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v78

    move/from16 v2, p3

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v4, v52

    :goto_4
    move/from16 p3, v2

    goto :goto_5

    :cond_2
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :goto_5
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v79

    move/from16 v2, p4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object/from16 v4, v52

    :goto_6
    move/from16 p4, v2

    goto :goto_7

    :cond_3
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :goto_7
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v80

    move/from16 v2, p5

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v81

    move/from16 v4, v16

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_4

    move/from16 p5, v2

    move-object/from16 v2, v52

    :goto_8
    move/from16 v16, v4

    goto :goto_9

    :cond_4
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v16

    move/from16 p5, v2

    move-object/from16 v2, v16

    goto :goto_8

    :goto_9
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v83

    move/from16 v2, v17

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v84

    move/from16 v4, v18

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v86

    move/from16 v17, v2

    move/from16 v2, v19

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v88

    move/from16 v19, v2

    move/from16 v2, v20

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v90

    move/from16 v20, v2

    move/from16 v2, v21

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v92

    move/from16 v21, v2

    move/from16 v2, v22

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_5

    move/from16 v22, v2

    move-object/from16 v2, v52

    :goto_a
    move/from16 v18, v4

    goto :goto_b

    :cond_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v18

    move/from16 v22, v2

    move-object/from16 v2, v18

    goto :goto_a

    :goto_b
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v94

    move/from16 v2, v23

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v95

    move/from16 v4, v24

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_6

    move/from16 v24, v2

    move-object/from16 v2, v52

    :goto_c
    move/from16 v23, v4

    goto :goto_d

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v23

    move/from16 v24, v2

    move-object/from16 v2, v23

    goto :goto_c

    :goto_d
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v97

    move/from16 v2, v25

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v98

    move/from16 v4, v26

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_7

    move/from16 v26, v2

    move-object/from16 v2, v52

    :goto_e
    move/from16 v25, v4

    goto :goto_f

    :cond_7
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v25

    move/from16 v26, v2

    move-object/from16 v2, v25

    goto :goto_e

    :goto_f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v100

    move/from16 v2, v27

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object/from16 v4, v52

    :goto_10
    move/from16 v27, v2

    goto :goto_11

    :cond_8
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    :goto_11
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v101

    move/from16 v2, v28

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v102

    move/from16 v4, v29

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v28

    if-eqz v28, :cond_9

    move/from16 v29, v2

    move-object/from16 v2, v52

    :goto_12
    move/from16 v28, v4

    goto :goto_13

    :cond_9
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v28

    move/from16 v29, v2

    move-object/from16 v2, v28

    goto :goto_12

    :goto_13
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v104

    move/from16 v2, v30

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v105

    move/from16 v4, v31

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v30

    if-eqz v30, :cond_a

    move/from16 v31, v2

    move-object/from16 v2, v52

    :goto_14
    move/from16 v30, v4

    goto :goto_15

    :cond_a
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v30

    move/from16 v31, v2

    move-object/from16 v2, v30

    goto :goto_14

    :goto_15
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v107

    move/from16 v2, v32

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v4, v52

    :goto_16
    move/from16 v32, v2

    goto :goto_17

    :cond_b
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_16

    :goto_17
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v108

    move/from16 v2, v33

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v109

    move/from16 v4, v34

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v111

    move/from16 v33, v2

    move/from16 v2, v35

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_c

    move/from16 v35, v2

    move-object/from16 v2, v52

    :goto_18
    move/from16 v34, v4

    goto :goto_19

    :cond_c
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v34

    move/from16 v35, v2

    move-object/from16 v2, v34

    goto :goto_18

    :goto_19
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v113

    move/from16 v2, v36

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v4, v52

    :goto_1a
    move/from16 v36, v2

    goto :goto_1b

    :cond_d
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1a

    :goto_1b
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v114

    move/from16 v2, v37

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_e

    move-object/from16 v4, v52

    :goto_1c
    move/from16 v37, v2

    goto :goto_1d

    :cond_e
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1c

    :goto_1d
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v115

    move/from16 v2, v38

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v116

    move/from16 v4, v39

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v38

    if-eqz v38, :cond_f

    move/from16 v39, v2

    move-object/from16 v2, v52

    :goto_1e
    move/from16 v38, v4

    goto :goto_1f

    :cond_f
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v38

    move/from16 v39, v2

    move-object/from16 v2, v38

    goto :goto_1e

    :goto_1f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v118

    move/from16 v2, v40

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v119

    move/from16 v4, v41

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_10

    move/from16 v41, v2

    move-object/from16 v2, v52

    :goto_20
    move/from16 v40, v4

    goto :goto_21

    :cond_10
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v40

    move/from16 v41, v2

    move-object/from16 v2, v40

    goto :goto_20

    :goto_21
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v121

    move/from16 v2, v42

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v122

    move/from16 v4, v43

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_11

    move/from16 v43, v2

    move-object/from16 v2, v52

    :goto_22
    move/from16 v42, v4

    goto :goto_23

    :cond_11
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v42

    move/from16 v43, v2

    move-object/from16 v2, v42

    goto :goto_22

    :goto_23
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v124

    move/from16 v2, v44

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_12

    move-object/from16 v4, v52

    :goto_24
    move/from16 v44, v2

    goto :goto_25

    :cond_12
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_24

    :goto_25
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v125

    move/from16 v2, v45

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v126

    move/from16 v4, v46

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_13

    :goto_26
    move/from16 v45, v2

    move/from16 v46, v4

    move-object/from16 v2, v52

    goto :goto_27

    :cond_13
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v52

    goto :goto_26

    :goto_27
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v128

    move/from16 v2, v47

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v47, v2

    move/from16 v129, v3

    move/from16 v4, v48

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v48, v5

    move/from16 v3, v49

    move/from16 v49, v4

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    new-instance v52, Lcom/sma/smartv3/db/entity/Weight;

    move/from16 v130, v2

    move/from16 v131, v4

    move/from16 v53, v14

    invoke-direct/range {v52 .. v131}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)V

    move-object/from16 v2, v52

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, v24

    move/from16 v24, v23

    move/from16 v23, v2

    move/from16 v2, v26

    move/from16 v26, v25

    move/from16 v25, v2

    move/from16 v2, v29

    move/from16 v29, v28

    move/from16 v28, v2

    move/from16 v2, v31

    move/from16 v31, v30

    move/from16 v30, v2

    move/from16 v2, v39

    move/from16 v39, v38

    move/from16 v38, v2

    move/from16 v2, v41

    move/from16 v41, v40

    move/from16 v40, v2

    move/from16 v2, v43

    move/from16 v43, v42

    move/from16 v42, v2

    move v2, v15

    move/from16 v5, v48

    move/from16 v48, v49

    move/from16 v14, v50

    move/from16 v15, v51

    move/from16 v4, v133

    move/from16 v49, v3

    move/from16 v3, v132

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_28

    :cond_14
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v0

    :goto_28
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/db/dao/WeightDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 138

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT * FROM Weight WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150"

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    const-string v2, "mId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mWeight"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mIsMeasure"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mBmi"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mRatioOfFat"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mWeightOfMuscle"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mWeightOfFat"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mRatioOfProtein"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mRatioOfWater"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mStateOfNutrition"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIdealWeight"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    const-string v0, "mAgeOfBody"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p1, v0

    const-string v0, "mAgeOfBodyRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v16, v0

    const-string v0, "mBmiRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v17, v0

    const-string v0, "mBmiWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    const-string v0, "mBmr"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v19, v0

    const-string v0, "mBmrRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    const-string v0, "mBodyShape"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v21, v0

    const-string v0, "mDesirableWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v22, v0

    const-string v0, "mFatFreeBodyWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v23, v0

    const-string v0, "mFatToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v0

    const-string v0, "mLevelOfVisceralFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v25, v0

    const-string v0, "mLevelOfVisceralFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v26, v0

    const-string v0, "mMuscleToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v27, v0

    const-string v0, "mRatioOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v28, v0

    const-string v0, "mRatioOfMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v29, v0

    const-string v0, "mRatioOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v30, v0

    const-string v0, "mRatioOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v31, v0

    const-string v0, "mRatioOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v32, v0

    const-string v0, "mRatioOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v33, v0

    const-string v0, "mRatioOfSubcutaneousFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v34, v0

    const-string v0, "mRatioOfSubcutaneousFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v35, v0

    const-string v0, "mRatioOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v36, v0

    const-string v0, "mScore"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v37, v0

    const-string v0, "mWeightOfBone"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v38, v0

    const-string v0, "mWeightOfBoneRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v39, v0

    const-string v0, "mWeightOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v40, v0

    const-string v0, "mWeightOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v41, v0

    const-string v0, "mWeightOfProtein"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v42, v0

    const-string v0, "mWeightOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v43, v0

    const-string v0, "mWeightOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v44, v0

    const-string v0, "mWeightOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v45, v0

    const-string v0, "mWeightOfWater"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v46, v0

    const-string v0, "mWeightOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v47, v0

    const-string v0, "mWeightRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v48, v0

    const-string v0, "mWeightToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v49, v0

    const-string v0, "mWeightWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v50, v0

    const-string v0, "mIsDelete"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v51, v0

    const-string v0, "mRatioOfProteinLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v52, v0

    const-string v0, "mRatioOfWaterLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v53, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v54

    if-eqz v54, :cond_14

    move/from16 v54, v14

    move/from16 v55, v15

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v58

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v15

    const/16 v56, 0x0

    if-eqz v15, :cond_0

    move-object/from16 v60, v56

    move v15, v2

    move/from16 v136, v3

    goto :goto_1

    :cond_0
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v60, v15

    move/from16 v136, v3

    move v15, v2

    :goto_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    move/from16 v61, v2

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v62, v2

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v64

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v66

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v68

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v70

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v72

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v74

    move/from16 v3, v54

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v76

    move/from16 v63, v2

    move/from16 v2, v55

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v78

    move/from16 v55, v2

    move/from16 v2, p1

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v80

    move/from16 p1, v2

    move/from16 v2, v16

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_1

    move/from16 v54, v2

    move-object/from16 v2, v56

    move/from16 v16, v3

    move/from16 v137, v4

    :goto_2
    move-object/from16 v3, p0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v16

    move/from16 v54, v2

    move-object/from16 v2, v16

    move/from16 v137, v4

    move/from16 v16, v3

    goto :goto_2

    :goto_3
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v82

    move/from16 v2, v17

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v4, v56

    :goto_4
    move/from16 v17, v2

    goto :goto_5

    :cond_2
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :goto_5
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v83

    move/from16 v2, v18

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object/from16 v4, v56

    :goto_6
    move/from16 v18, v2

    goto :goto_7

    :cond_3
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :goto_7
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v84

    move/from16 v2, v19

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v85

    move/from16 v4, v20

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v19

    if-eqz v19, :cond_4

    move/from16 v20, v2

    move-object/from16 v2, v56

    :goto_8
    move/from16 v19, v4

    goto :goto_9

    :cond_4
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    move/from16 v20, v2

    move-object/from16 v2, v19

    goto :goto_8

    :goto_9
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v87

    move/from16 v2, v21

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v88

    move/from16 v4, v22

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v90

    move/from16 v21, v2

    move/from16 v2, v23

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v92

    move/from16 v23, v2

    move/from16 v2, v24

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v94

    move/from16 v24, v2

    move/from16 v2, v25

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v96

    move/from16 v25, v2

    move/from16 v2, v26

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_5

    move/from16 v26, v2

    move-object/from16 v2, v56

    :goto_a
    move/from16 v22, v4

    goto :goto_b

    :cond_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v22

    move/from16 v26, v2

    move-object/from16 v2, v22

    goto :goto_a

    :goto_b
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v98

    move/from16 v2, v27

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v99

    move/from16 v4, v28

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v27

    if-eqz v27, :cond_6

    move/from16 v28, v2

    move-object/from16 v2, v56

    :goto_c
    move/from16 v27, v4

    goto :goto_d

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v27

    move/from16 v28, v2

    move-object/from16 v2, v27

    goto :goto_c

    :goto_d
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v101

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v102

    move/from16 v4, v30

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_7

    move/from16 v30, v2

    move-object/from16 v2, v56

    :goto_e
    move/from16 v29, v4

    goto :goto_f

    :cond_7
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v30, v2

    move-object/from16 v2, v29

    goto :goto_e

    :goto_f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v104

    move/from16 v2, v31

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object/from16 v4, v56

    :goto_10
    move/from16 v31, v2

    goto :goto_11

    :cond_8
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    :goto_11
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v105

    move/from16 v2, v32

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v106

    move/from16 v4, v33

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v32

    if-eqz v32, :cond_9

    move/from16 v33, v2

    move-object/from16 v2, v56

    :goto_12
    move/from16 v32, v4

    goto :goto_13

    :cond_9
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v32

    move/from16 v33, v2

    move-object/from16 v2, v32

    goto :goto_12

    :goto_13
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v108

    move/from16 v2, v34

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v109

    move/from16 v4, v35

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_a

    move/from16 v35, v2

    move-object/from16 v2, v56

    :goto_14
    move/from16 v34, v4

    goto :goto_15

    :cond_a
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v34

    move/from16 v35, v2

    move-object/from16 v2, v34

    goto :goto_14

    :goto_15
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v111

    move/from16 v2, v36

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v4, v56

    :goto_16
    move/from16 v36, v2

    goto :goto_17

    :cond_b
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_16

    :goto_17
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v112

    move/from16 v2, v37

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v113

    move/from16 v4, v38

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v115

    move/from16 v37, v2

    move/from16 v2, v39

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v38

    if-eqz v38, :cond_c

    move/from16 v39, v2

    move-object/from16 v2, v56

    :goto_18
    move/from16 v38, v4

    goto :goto_19

    :cond_c
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v38

    move/from16 v39, v2

    move-object/from16 v2, v38

    goto :goto_18

    :goto_19
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v117

    move/from16 v2, v40

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v4, v56

    :goto_1a
    move/from16 v40, v2

    goto :goto_1b

    :cond_d
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1a

    :goto_1b
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v118

    move/from16 v2, v41

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_e

    move-object/from16 v4, v56

    :goto_1c
    move/from16 v41, v2

    goto :goto_1d

    :cond_e
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1c

    :goto_1d
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v119

    move/from16 v2, v42

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v120

    move/from16 v4, v43

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_f

    move/from16 v43, v2

    move-object/from16 v2, v56

    :goto_1e
    move/from16 v42, v4

    goto :goto_1f

    :cond_f
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v42

    move/from16 v43, v2

    move-object/from16 v2, v42

    goto :goto_1e

    :goto_1f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v122

    move/from16 v2, v44

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v123

    move/from16 v4, v45

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v44

    if-eqz v44, :cond_10

    move/from16 v45, v2

    move-object/from16 v2, v56

    :goto_20
    move/from16 v44, v4

    goto :goto_21

    :cond_10
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v44

    move/from16 v45, v2

    move-object/from16 v2, v44

    goto :goto_20

    :goto_21
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v125

    move/from16 v2, v46

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v126

    move/from16 v4, v47

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_11

    move/from16 v47, v2

    move-object/from16 v2, v56

    :goto_22
    move/from16 v46, v4

    goto :goto_23

    :cond_11
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v46

    move/from16 v47, v2

    move-object/from16 v2, v46

    goto :goto_22

    :goto_23
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v128

    move/from16 v2, v48

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_12

    move-object/from16 v4, v56

    :goto_24
    move/from16 v48, v2

    goto :goto_25

    :cond_12
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_24

    :goto_25
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v129

    move/from16 v2, v49

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v130

    move/from16 v4, v50

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v49

    if-eqz v49, :cond_13

    :goto_26
    move/from16 v49, v2

    move/from16 v50, v4

    move-object/from16 v2, v56

    goto :goto_27

    :cond_13
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v56

    goto :goto_26

    :goto_27
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v132

    move/from16 v2, v51

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v51, v2

    move/from16 v133, v3

    move/from16 v4, v52

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v52, v5

    move/from16 v3, v53

    move/from16 v53, v4

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    new-instance v56, Lcom/sma/smartv3/db/entity/Weight;

    move/from16 v134, v2

    move/from16 v135, v4

    move/from16 v57, v14

    invoke-direct/range {v56 .. v135}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)V

    move-object/from16 v2, v56

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, v20

    move/from16 v20, v19

    move/from16 v19, v2

    move/from16 v2, v28

    move/from16 v28, v27

    move/from16 v27, v2

    move/from16 v2, v30

    move/from16 v30, v29

    move/from16 v29, v2

    move/from16 v2, v33

    move/from16 v33, v32

    move/from16 v32, v2

    move/from16 v2, v35

    move/from16 v35, v34

    move/from16 v34, v2

    move/from16 v2, v43

    move/from16 v43, v42

    move/from16 v42, v2

    move/from16 v2, v45

    move/from16 v45, v44

    move/from16 v44, v2

    move/from16 v2, v47

    move/from16 v47, v46

    move/from16 v46, v2

    move v2, v15

    move/from16 v14, v16

    move/from16 v5, v52

    move/from16 v52, v53

    move/from16 v16, v54

    move/from16 v15, v55

    move/from16 v4, v137

    move/from16 v53, v3

    move/from16 v3, v136

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_28

    :cond_14
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v0

    :goto_28
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OXO1(JLandroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM Weight WHERE mTime = ?"

    invoke-interface {p2, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p2, v0, p0, p1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    invoke-interface {p2}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Landroidx/sqlite/SQLiteStatement;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p2}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/db/dao/WeightDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__updateAdapterOfWeight:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/db/dao/WeightDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)[J
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__insertAdapterOfWeight:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnIdsArray(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/db/dao/WeightDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 138

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT * FROM Weight WHERE mIsDelete != 1 ORDER BY mTime ASC"

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    const-string v2, "mId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mWeight"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mIsMeasure"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mBmi"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mRatioOfFat"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mWeightOfMuscle"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mWeightOfFat"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mRatioOfProtein"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mRatioOfWater"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mStateOfNutrition"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIdealWeight"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    const-string v0, "mAgeOfBody"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p1, v0

    const-string v0, "mAgeOfBodyRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v16, v0

    const-string v0, "mBmiRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v17, v0

    const-string v0, "mBmiWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    const-string v0, "mBmr"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v19, v0

    const-string v0, "mBmrRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    const-string v0, "mBodyShape"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v21, v0

    const-string v0, "mDesirableWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v22, v0

    const-string v0, "mFatFreeBodyWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v23, v0

    const-string v0, "mFatToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v0

    const-string v0, "mLevelOfVisceralFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v25, v0

    const-string v0, "mLevelOfVisceralFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v26, v0

    const-string v0, "mMuscleToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v27, v0

    const-string v0, "mRatioOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v28, v0

    const-string v0, "mRatioOfMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v29, v0

    const-string v0, "mRatioOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v30, v0

    const-string v0, "mRatioOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v31, v0

    const-string v0, "mRatioOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v32, v0

    const-string v0, "mRatioOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v33, v0

    const-string v0, "mRatioOfSubcutaneousFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v34, v0

    const-string v0, "mRatioOfSubcutaneousFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v35, v0

    const-string v0, "mRatioOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v36, v0

    const-string v0, "mScore"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v37, v0

    const-string v0, "mWeightOfBone"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v38, v0

    const-string v0, "mWeightOfBoneRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v39, v0

    const-string v0, "mWeightOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v40, v0

    const-string v0, "mWeightOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v41, v0

    const-string v0, "mWeightOfProtein"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v42, v0

    const-string v0, "mWeightOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v43, v0

    const-string v0, "mWeightOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v44, v0

    const-string v0, "mWeightOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v45, v0

    const-string v0, "mWeightOfWater"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v46, v0

    const-string v0, "mWeightOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v47, v0

    const-string v0, "mWeightRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v48, v0

    const-string v0, "mWeightToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v49, v0

    const-string v0, "mWeightWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v50, v0

    const-string v0, "mIsDelete"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v51, v0

    const-string v0, "mRatioOfProteinLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v52, v0

    const-string v0, "mRatioOfWaterLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v53, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v54

    if-eqz v54, :cond_14

    move/from16 v54, v14

    move/from16 v55, v15

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v58

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v15

    const/16 v56, 0x0

    if-eqz v15, :cond_0

    move-object/from16 v60, v56

    move v15, v2

    move/from16 v136, v3

    goto :goto_1

    :cond_0
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v60, v15

    move/from16 v136, v3

    move v15, v2

    :goto_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    move/from16 v61, v2

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v62, v2

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v64

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v66

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v68

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v70

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v72

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v74

    move/from16 v3, v54

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v76

    move/from16 v63, v2

    move/from16 v2, v55

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v78

    move/from16 v55, v2

    move/from16 v2, p1

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v80

    move/from16 p1, v2

    move/from16 v2, v16

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_1

    move/from16 v54, v2

    move-object/from16 v2, v56

    move/from16 v16, v3

    move/from16 v137, v4

    :goto_2
    move-object/from16 v3, p0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v16

    move/from16 v54, v2

    move-object/from16 v2, v16

    move/from16 v137, v4

    move/from16 v16, v3

    goto :goto_2

    :goto_3
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v82

    move/from16 v2, v17

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v4, v56

    :goto_4
    move/from16 v17, v2

    goto :goto_5

    :cond_2
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :goto_5
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v83

    move/from16 v2, v18

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object/from16 v4, v56

    :goto_6
    move/from16 v18, v2

    goto :goto_7

    :cond_3
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :goto_7
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v84

    move/from16 v2, v19

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v85

    move/from16 v4, v20

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v19

    if-eqz v19, :cond_4

    move/from16 v20, v2

    move-object/from16 v2, v56

    :goto_8
    move/from16 v19, v4

    goto :goto_9

    :cond_4
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v19

    move/from16 v20, v2

    move-object/from16 v2, v19

    goto :goto_8

    :goto_9
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v87

    move/from16 v2, v21

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v88

    move/from16 v4, v22

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v90

    move/from16 v21, v2

    move/from16 v2, v23

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v92

    move/from16 v23, v2

    move/from16 v2, v24

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v94

    move/from16 v24, v2

    move/from16 v2, v25

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v96

    move/from16 v25, v2

    move/from16 v2, v26

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_5

    move/from16 v26, v2

    move-object/from16 v2, v56

    :goto_a
    move/from16 v22, v4

    goto :goto_b

    :cond_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v22

    move/from16 v26, v2

    move-object/from16 v2, v22

    goto :goto_a

    :goto_b
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v98

    move/from16 v2, v27

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v99

    move/from16 v4, v28

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v27

    if-eqz v27, :cond_6

    move/from16 v28, v2

    move-object/from16 v2, v56

    :goto_c
    move/from16 v27, v4

    goto :goto_d

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v27

    move/from16 v28, v2

    move-object/from16 v2, v27

    goto :goto_c

    :goto_d
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v101

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v102

    move/from16 v4, v30

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_7

    move/from16 v30, v2

    move-object/from16 v2, v56

    :goto_e
    move/from16 v29, v4

    goto :goto_f

    :cond_7
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v29

    move/from16 v30, v2

    move-object/from16 v2, v29

    goto :goto_e

    :goto_f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v104

    move/from16 v2, v31

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object/from16 v4, v56

    :goto_10
    move/from16 v31, v2

    goto :goto_11

    :cond_8
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    :goto_11
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v105

    move/from16 v2, v32

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v106

    move/from16 v4, v33

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v32

    if-eqz v32, :cond_9

    move/from16 v33, v2

    move-object/from16 v2, v56

    :goto_12
    move/from16 v32, v4

    goto :goto_13

    :cond_9
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v32

    move/from16 v33, v2

    move-object/from16 v2, v32

    goto :goto_12

    :goto_13
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v108

    move/from16 v2, v34

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v109

    move/from16 v4, v35

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_a

    move/from16 v35, v2

    move-object/from16 v2, v56

    :goto_14
    move/from16 v34, v4

    goto :goto_15

    :cond_a
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v34

    move/from16 v35, v2

    move-object/from16 v2, v34

    goto :goto_14

    :goto_15
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v111

    move/from16 v2, v36

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v4, v56

    :goto_16
    move/from16 v36, v2

    goto :goto_17

    :cond_b
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_16

    :goto_17
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v112

    move/from16 v2, v37

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v113

    move/from16 v4, v38

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v115

    move/from16 v37, v2

    move/from16 v2, v39

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v38

    if-eqz v38, :cond_c

    move/from16 v39, v2

    move-object/from16 v2, v56

    :goto_18
    move/from16 v38, v4

    goto :goto_19

    :cond_c
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v38

    move/from16 v39, v2

    move-object/from16 v2, v38

    goto :goto_18

    :goto_19
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v117

    move/from16 v2, v40

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v4, v56

    :goto_1a
    move/from16 v40, v2

    goto :goto_1b

    :cond_d
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1a

    :goto_1b
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v118

    move/from16 v2, v41

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_e

    move-object/from16 v4, v56

    :goto_1c
    move/from16 v41, v2

    goto :goto_1d

    :cond_e
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1c

    :goto_1d
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v119

    move/from16 v2, v42

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v120

    move/from16 v4, v43

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_f

    move/from16 v43, v2

    move-object/from16 v2, v56

    :goto_1e
    move/from16 v42, v4

    goto :goto_1f

    :cond_f
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v42

    move/from16 v43, v2

    move-object/from16 v2, v42

    goto :goto_1e

    :goto_1f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v122

    move/from16 v2, v44

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v123

    move/from16 v4, v45

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v44

    if-eqz v44, :cond_10

    move/from16 v45, v2

    move-object/from16 v2, v56

    :goto_20
    move/from16 v44, v4

    goto :goto_21

    :cond_10
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v44

    move/from16 v45, v2

    move-object/from16 v2, v44

    goto :goto_20

    :goto_21
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v125

    move/from16 v2, v46

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v126

    move/from16 v4, v47

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_11

    move/from16 v47, v2

    move-object/from16 v2, v56

    :goto_22
    move/from16 v46, v4

    goto :goto_23

    :cond_11
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v46

    move/from16 v47, v2

    move-object/from16 v2, v46

    goto :goto_22

    :goto_23
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v128

    move/from16 v2, v48

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_12

    move-object/from16 v4, v56

    :goto_24
    move/from16 v48, v2

    goto :goto_25

    :cond_12
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_24

    :goto_25
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v129

    move/from16 v2, v49

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v130

    move/from16 v4, v50

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v49

    if-eqz v49, :cond_13

    :goto_26
    move/from16 v49, v2

    move/from16 v50, v4

    move-object/from16 v2, v56

    goto :goto_27

    :cond_13
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v56

    goto :goto_26

    :goto_27
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v132

    move/from16 v2, v51

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v51, v2

    move/from16 v133, v3

    move/from16 v4, v52

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v52, v5

    move/from16 v3, v53

    move/from16 v53, v4

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    new-instance v56, Lcom/sma/smartv3/db/entity/Weight;

    move/from16 v134, v2

    move/from16 v135, v4

    move/from16 v57, v14

    invoke-direct/range {v56 .. v135}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)V

    move-object/from16 v2, v56

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, v20

    move/from16 v20, v19

    move/from16 v19, v2

    move/from16 v2, v28

    move/from16 v28, v27

    move/from16 v27, v2

    move/from16 v2, v30

    move/from16 v30, v29

    move/from16 v29, v2

    move/from16 v2, v33

    move/from16 v33, v32

    move/from16 v32, v2

    move/from16 v2, v35

    move/from16 v35, v34

    move/from16 v34, v2

    move/from16 v2, v43

    move/from16 v43, v42

    move/from16 v42, v2

    move/from16 v2, v45

    move/from16 v45, v44

    move/from16 v44, v2

    move/from16 v2, v47

    move/from16 v47, v46

    move/from16 v46, v2

    move v2, v15

    move/from16 v14, v16

    move/from16 v5, v52

    move/from16 v52, v53

    move/from16 v16, v54

    move/from16 v15, v55

    move/from16 v4, v137

    move/from16 v53, v3

    move/from16 v3, v136

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_28

    :cond_14
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v0

    :goto_28
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/db/dao/WeightDao_Impl;IILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 136

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT * FROM Weight WHERE  mIsDelete != 1 ORDER BY mTime DESC LIMIT ?, ?"

    move-object/from16 v2, p3

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v2, 0x1

    move/from16 v3, p1

    int-to-long v3, v3

    :try_start_0
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v2, 0x2

    move/from16 v3, p2

    int-to-long v3, v3

    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const-string v2, "mId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mWeight"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mIsMeasure"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mBmi"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mRatioOfFat"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mWeightOfMuscle"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mWeightOfFat"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mRatioOfProtein"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mRatioOfWater"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mStateOfNutrition"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIdealWeight"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    const-string v0, "mAgeOfBody"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p1, v0

    const-string v0, "mAgeOfBodyRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p2, v0

    const-string v0, "mBmiRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 p3, v0

    const-string v0, "mBmiWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v16, v0

    const-string v0, "mBmr"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v17, v0

    const-string v0, "mBmrRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    const-string v0, "mBodyShape"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v19, v0

    const-string v0, "mDesirableWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    const-string v0, "mFatFreeBodyWeight"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v21, v0

    const-string v0, "mFatToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v22, v0

    const-string v0, "mLevelOfVisceralFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v23, v0

    const-string v0, "mLevelOfVisceralFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v24, v0

    const-string v0, "mMuscleToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v25, v0

    const-string v0, "mRatioOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v26, v0

    const-string v0, "mRatioOfMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v27, v0

    const-string v0, "mRatioOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v28, v0

    const-string v0, "mRatioOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v29, v0

    const-string v0, "mRatioOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v30, v0

    const-string v0, "mRatioOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v31, v0

    const-string v0, "mRatioOfSubcutaneousFat"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v32, v0

    const-string v0, "mRatioOfSubcutaneousFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v33, v0

    const-string v0, "mRatioOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v34, v0

    const-string v0, "mScore"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v35, v0

    const-string v0, "mWeightOfBone"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v36, v0

    const-string v0, "mWeightOfBoneRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v37, v0

    const-string v0, "mWeightOfFatRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v38, v0

    const-string v0, "mWeightOfMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v39, v0

    const-string v0, "mWeightOfProtein"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v40, v0

    const-string v0, "mWeightOfProteinRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v41, v0

    const-string v0, "mWeightOfSkeletalMuscle"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v42, v0

    const-string v0, "mWeightOfSkeletalMuscleRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v43, v0

    const-string v0, "mWeightOfWater"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v44, v0

    const-string v0, "mWeightOfWaterRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v45, v0

    const-string v0, "mWeightRange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v46, v0

    const-string v0, "mWeightToControl"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v47, v0

    const-string v0, "mWeightWHORange"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v48, v0

    const-string v0, "mIsDelete"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v49, v0

    const-string v0, "mRatioOfProteinLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v50, v0

    const-string v0, "mRatioOfWaterLevel"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v51, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v52

    if-eqz v52, :cond_14

    move/from16 v52, v14

    move/from16 v53, v15

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v56

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v15

    const/16 v54, 0x0

    if-eqz v15, :cond_0

    move-object/from16 v58, v54

    move v15, v2

    move/from16 v134, v3

    goto :goto_1

    :cond_0
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v58, v15

    move/from16 v134, v3

    move v15, v2

    :goto_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    move/from16 v59, v2

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v60, v2

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v62

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v64

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v66

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v68

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v70

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v72

    move/from16 v3, v52

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v74

    move/from16 v61, v2

    move/from16 v2, v53

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v76

    move/from16 v53, v2

    move/from16 v2, p1

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v78

    move/from16 p1, v2

    move/from16 v2, p2

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v52

    if-eqz v52, :cond_1

    move/from16 p2, v2

    move-object/from16 v2, v54

    move/from16 v52, v3

    move/from16 v135, v4

    :goto_2
    move-object/from16 v3, p0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v52

    move/from16 p2, v2

    move-object/from16 v2, v52

    move/from16 v135, v4

    move/from16 v52, v3

    goto :goto_2

    :goto_3
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v80

    move/from16 v2, p3

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v4, v54

    :goto_4
    move/from16 p3, v2

    goto :goto_5

    :cond_2
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :goto_5
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v81

    move/from16 v2, v16

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object/from16 v4, v54

    :goto_6
    move/from16 v16, v2

    goto :goto_7

    :cond_3
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :goto_7
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v82

    move/from16 v2, v17

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v83

    move/from16 v4, v18

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_4

    move/from16 v18, v2

    move-object/from16 v2, v54

    :goto_8
    move/from16 v17, v4

    goto :goto_9

    :cond_4
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move/from16 v18, v2

    move-object/from16 v2, v17

    goto :goto_8

    :goto_9
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v85

    move/from16 v2, v19

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v86

    move/from16 v4, v20

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v88

    move/from16 v19, v2

    move/from16 v2, v21

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v90

    move/from16 v21, v2

    move/from16 v2, v22

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v92

    move/from16 v22, v2

    move/from16 v2, v23

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v94

    move/from16 v23, v2

    move/from16 v2, v24

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_5

    move/from16 v24, v2

    move-object/from16 v2, v54

    :goto_a
    move/from16 v20, v4

    goto :goto_b

    :cond_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v20

    move/from16 v24, v2

    move-object/from16 v2, v20

    goto :goto_a

    :goto_b
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v96

    move/from16 v2, v25

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v97

    move/from16 v4, v26

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_6

    move/from16 v26, v2

    move-object/from16 v2, v54

    :goto_c
    move/from16 v25, v4

    goto :goto_d

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v25

    move/from16 v26, v2

    move-object/from16 v2, v25

    goto :goto_c

    :goto_d
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v99

    move/from16 v2, v27

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v100

    move/from16 v4, v28

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v27

    if-eqz v27, :cond_7

    move/from16 v28, v2

    move-object/from16 v2, v54

    :goto_e
    move/from16 v27, v4

    goto :goto_f

    :cond_7
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v27

    move/from16 v28, v2

    move-object/from16 v2, v27

    goto :goto_e

    :goto_f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v102

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object/from16 v4, v54

    :goto_10
    move/from16 v29, v2

    goto :goto_11

    :cond_8
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    :goto_11
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v103

    move/from16 v2, v30

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v104

    move/from16 v4, v31

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v30

    if-eqz v30, :cond_9

    move/from16 v31, v2

    move-object/from16 v2, v54

    :goto_12
    move/from16 v30, v4

    goto :goto_13

    :cond_9
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v30

    move/from16 v31, v2

    move-object/from16 v2, v30

    goto :goto_12

    :goto_13
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v106

    move/from16 v2, v32

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v107

    move/from16 v4, v33

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v32

    if-eqz v32, :cond_a

    move/from16 v33, v2

    move-object/from16 v2, v54

    :goto_14
    move/from16 v32, v4

    goto :goto_15

    :cond_a
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v32

    move/from16 v33, v2

    move-object/from16 v2, v32

    goto :goto_14

    :goto_15
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v109

    move/from16 v2, v34

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v4, v54

    :goto_16
    move/from16 v34, v2

    goto :goto_17

    :cond_b
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_16

    :goto_17
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v110

    move/from16 v2, v35

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v111

    move/from16 v4, v36

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v113

    move/from16 v35, v2

    move/from16 v2, v37

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_c

    move/from16 v37, v2

    move-object/from16 v2, v54

    :goto_18
    move/from16 v36, v4

    goto :goto_19

    :cond_c
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v36

    move/from16 v37, v2

    move-object/from16 v2, v36

    goto :goto_18

    :goto_19
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v115

    move/from16 v2, v38

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v4, v54

    :goto_1a
    move/from16 v38, v2

    goto :goto_1b

    :cond_d
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1a

    :goto_1b
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v116

    move/from16 v2, v39

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_e

    move-object/from16 v4, v54

    :goto_1c
    move/from16 v39, v2

    goto :goto_1d

    :cond_e
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1c

    :goto_1d
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v117

    move/from16 v2, v40

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v118

    move/from16 v4, v41

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_f

    move/from16 v41, v2

    move-object/from16 v2, v54

    :goto_1e
    move/from16 v40, v4

    goto :goto_1f

    :cond_f
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v40

    move/from16 v41, v2

    move-object/from16 v2, v40

    goto :goto_1e

    :goto_1f
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v120

    move/from16 v2, v42

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v121

    move/from16 v4, v43

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_10

    move/from16 v43, v2

    move-object/from16 v2, v54

    :goto_20
    move/from16 v42, v4

    goto :goto_21

    :cond_10
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v42

    move/from16 v43, v2

    move-object/from16 v2, v42

    goto :goto_20

    :goto_21
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v123

    move/from16 v2, v44

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v124

    move/from16 v4, v45

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v44

    if-eqz v44, :cond_11

    move/from16 v45, v2

    move-object/from16 v2, v54

    :goto_22
    move/from16 v44, v4

    goto :goto_23

    :cond_11
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v44

    move/from16 v45, v2

    move-object/from16 v2, v44

    goto :goto_22

    :goto_23
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v126

    move/from16 v2, v46

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_12

    move-object/from16 v4, v54

    :goto_24
    move/from16 v46, v2

    goto :goto_25

    :cond_12
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_24

    :goto_25
    iget-object v2, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v127

    move/from16 v2, v47

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v128

    move/from16 v4, v48

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v47

    if-eqz v47, :cond_13

    :goto_26
    move/from16 v47, v2

    move/from16 v48, v4

    move-object/from16 v2, v54

    goto :goto_27

    :cond_13
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v54

    goto :goto_26

    :goto_27
    iget-object v4, v3, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__listDoubleConverter:Lcom/sma/smartv3/db/entity/ListDoubleConverter;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/ListDoubleConverter;->stringToObject(Ljava/lang/String;)Ljava/util/List;

    move-result-object v130

    move/from16 v2, v49

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v49, v2

    move/from16 v131, v3

    move/from16 v4, v50

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v50, v5

    move/from16 v3, v51

    move/from16 v51, v4

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    new-instance v54, Lcom/sma/smartv3/db/entity/Weight;

    move/from16 v132, v2

    move/from16 v133, v4

    move/from16 v55, v14

    invoke-direct/range {v54 .. v133}, Lcom/sma/smartv3/db/entity/Weight;-><init>(IJLjava/lang/String;FIIDDDDDDDDDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DDDDDLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;DLjava/util/List;DLjava/util/List;Ljava/util/List;DLjava/util/List;III)V

    move-object/from16 v2, v54

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, v18

    move/from16 v18, v17

    move/from16 v17, v2

    move/from16 v2, v26

    move/from16 v26, v25

    move/from16 v25, v2

    move/from16 v2, v28

    move/from16 v28, v27

    move/from16 v27, v2

    move/from16 v2, v31

    move/from16 v31, v30

    move/from16 v30, v2

    move/from16 v2, v33

    move/from16 v33, v32

    move/from16 v32, v2

    move/from16 v2, v41

    move/from16 v41, v40

    move/from16 v40, v2

    move/from16 v2, v43

    move/from16 v43, v42

    move/from16 v42, v2

    move/from16 v2, v45

    move/from16 v45, v44

    move/from16 v44, v2

    move v2, v15

    move/from16 v5, v50

    move/from16 v50, v51

    move/from16 v14, v52

    move/from16 v15, v53

    move/from16 v4, v135

    move/from16 v51, v3

    move/from16 v3, v134

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_28

    :cond_14
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v0

    :goto_28
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method


# virtual methods
.method public delete(J)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "mTime"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/my6;

    invoke-direct {v1, p1, p2}, Lcom/android/mltcode/paycertificationapi/my6;-><init>(J)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public getListASC()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ny6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ny6;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getTestWeights(JJ)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "start",
            "end"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/WeightDao$DefaultImpls;->getTestWeights(Lcom/sma/smartv3/db/dao/WeightDao;JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getWeights()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ky6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ky6;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getWeightsASC(JJ)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "start",
            "end"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oy6;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oy6;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;JJ)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getWeightsDESC(II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "startIndex",
            "endIndex"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/py6;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/py6;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public insert(Ljava/util/List;)[J
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "list"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;)[J"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ly6;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/ly6;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [J

    return-object p1
.end method

.method public update(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "lists"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/WeightDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jy6;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/jy6;-><init>(Lcom/sma/smartv3/db/dao/WeightDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
