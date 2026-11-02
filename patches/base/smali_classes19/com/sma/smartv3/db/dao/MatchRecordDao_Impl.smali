.class public final Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/MatchRecordDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfMatchLog:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfMatchPeriod:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfMatchRecord:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final __matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

.field private final __updateAdapterOfMatchRecord:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
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

    new-instance v0, Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-direct {v0}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__insertAdapterOfMatchRecord:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$2;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__insertAdapterOfMatchPeriod:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$3;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$3;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__insertAdapterOfMatchLog:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$4;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl$4;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__updateAdapterOfMatchRecord:Landroidx/room/EntityDeleteOrUpdateAdapter;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)[J
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__insertAdapterOfMatchPeriod:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnIdsArray(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(ILandroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 3

    const-string v0, "DELETE FROM MatchRecord WHERE mId = ?"

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;ILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 54

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT * FROM MatchRecord WHERE mIsDelete != 1 AND mSource = ?"

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v2, 0x1

    move/from16 v3, p1

    int-to-long v3, v3

    :try_start_0
    invoke-interface {v1, v2, v3, v4}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const-string v2, "mId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mStart"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mType"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mPeriodListSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mLogListSize"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mIsSync"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mIsDelete"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mSource"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mIsStopWatchData"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mStopWatchList"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mTeamInfo"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mWeather"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mHomeTeamScore"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "mGuestTeamScore"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p2, v15

    const-string v15, "mMode"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mMinBpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mAirPressure"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mMaxPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mMinPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mMaxSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mMinSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mMaxAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "mMinAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    const-string v15, "p_mId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v28, v14

    const-string v14, "p_mMatchRecordId"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    move/from16 v29, v13

    const-string v13, "p_mDuration"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v0, "p_mDistance"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v30, v12

    const-string v12, "p_mStep"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    move/from16 v31, v11

    const-string v11, "p_mCalorie"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    move/from16 v32, v10

    const-string v10, "p_mSpeed"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    move/from16 v33, v9

    const-string v9, "p_mAvgBpm"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    move/from16 v34, v8

    const-string v8, "p_mMaxBpm"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    move/from16 v35, v7

    const-string v7, "p_mMaxSpeed"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    move/from16 v36, v6

    const-string v6, "p_mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    move/from16 v37, v5

    const-string v5, "p_mIsDelete"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    move/from16 v38, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v39

    if-eqz v39, :cond_4

    move/from16 v39, v3

    move-object/from16 v40, v4

    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v42, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v43, v3

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v44, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v45, v3

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v46, v3

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v47, v3

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v48, v3

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v49, v3

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v50, v3

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v51, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v52, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    new-instance v41, Lcom/sma/smartv3/db/entity/MatchPeriod;

    move/from16 v53, v3

    invoke-direct/range {v41 .. v53}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIII)V

    move-object/from16 v3, v41

    new-instance v4, Lcom/sma/smartv3/db/entity/MatchRecord;

    invoke-direct {v4}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>()V

    move/from16 v42, v5

    move/from16 v41, v6

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMId(I)V

    move/from16 v5, v39

    move/from16 v39, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMStart(J)V

    move/from16 v6, v38

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v7

    const/16 v38, 0x0

    if-eqz v7, :cond_0

    move-object/from16 v7, v38

    goto :goto_1

    :cond_0
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    :goto_1
    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMLocalTime(Ljava/lang/String;)V

    move/from16 v43, v6

    move/from16 v7, v37

    move/from16 v37, v5

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMType(I)V

    move/from16 v5, v36

    move/from16 v36, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPeriodListSize(I)V

    move/from16 v6, v35

    move/from16 v35, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMLogListSize(I)V

    move v8, v5

    move/from16 v7, v34

    move/from16 v34, v6

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsSync(I)V

    move/from16 v5, v33

    move/from16 v33, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsDelete(I)V

    move/from16 v6, v32

    move/from16 v32, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMSource(I)V

    move v8, v5

    move/from16 v7, v31

    move/from16 v31, v6

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsStopWatchData(I)V

    move/from16 v5, v30

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object/from16 v6, v38

    :goto_2
    move/from16 v30, v0

    move/from16 v44, v2

    move-object/from16 v0, p0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :goto_3
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToStopWatchList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMStopWatchList(Ljava/util/List;)V

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object/from16 v6, v38

    :goto_4
    move/from16 v29, v2

    goto :goto_5

    :cond_2
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :goto_5
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToTeamInfo(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMTeamInfo(Lcom/szabh/smable3/entity/BleMatchRecordTeam3;)V

    move/from16 v2, v28

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_6
    move/from16 v28, v2

    move-object/from16 v6, v38

    goto :goto_7

    :cond_3
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v38

    goto :goto_6

    :goto_7
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToWeather(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleWeather;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMWeather(Lcom/szabh/smable3/entity/BleWeather;)V

    move/from16 v2, p1

    move/from16 v38, v5

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMHomeTeamScore(I)V

    move/from16 v5, p2

    move/from16 v45, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMGuestTeamScore(I)V

    move/from16 p1, v8

    move/from16 v6, v16

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMode(I)V

    move/from16 p2, v5

    move/from16 v16, v6

    move/from16 v7, v17

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinBpm(I)V

    move/from16 v17, v7

    move/from16 v5, v18

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMAirPressure(I)V

    move/from16 v6, v19

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPace(I)V

    move/from16 v18, v5

    move/from16 v19, v6

    move/from16 v7, v20

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxPace(I)V

    move/from16 v20, v7

    move/from16 v5, v21

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinPace(I)V

    move/from16 v6, v22

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMSpm(I)V

    move/from16 v21, v5

    move/from16 v22, v6

    move/from16 v7, v23

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxSpm(I)V

    move/from16 v23, v7

    move/from16 v5, v24

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinSpm(I)V

    move/from16 v6, v25

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMAltitude(I)V

    move/from16 v24, v5

    move/from16 v25, v6

    move/from16 v7, v26

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxAltitude(I)V

    move/from16 v26, v7

    move/from16 v5, v27

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinAltitude(I)V

    invoke-virtual {v4, v3}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPeriod(Lcom/sma/smartv3/db/entity/MatchPeriod;)V

    move-object/from16 v3, v40

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v3

    move/from16 v27, v5

    move/from16 v0, v30

    move/from16 v8, v35

    move/from16 v3, v37

    move/from16 v30, v38

    move/from16 v7, v39

    move/from16 v6, v41

    move/from16 v5, v42

    move/from16 v38, v43

    move/from16 v35, v34

    move/from16 v37, v36

    move/from16 v36, v32

    move/from16 v34, v33

    move/from16 v33, p1

    move/from16 p1, v2

    move/from16 v32, v31

    move/from16 v2, v44

    move/from16 v31, v45

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_4
    move-object v3, v4

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v3

    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)[J
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__insertAdapterOfMatchLog:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnIdsArray(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Lcom/sma/smartv3/db/entity/MatchRecord;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__insertAdapterOfMatchRecord:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnId(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(ILandroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 3

    const-string v0, "DELETE FROM MatchPeriod WHERE mMatchRecordId = ?"

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;IILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 53

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT * FROM MatchRecord WHERE  mIsDelete != 1 ORDER BY mStart DESC LIMIT ?, ?"

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

    const-string v3, "mStart"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mType"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mPeriodListSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mLogListSize"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mIsSync"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mIsDelete"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mSource"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mIsStopWatchData"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mStopWatchList"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mTeamInfo"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mWeather"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mHomeTeamScore"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "mGuestTeamScore"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p2, v15

    const-string v15, "mMode"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p3, v15

    const-string v15, "mMinBpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mAirPressure"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mMaxPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mMinPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mMaxSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mMinSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mMaxAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mMinAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "p_mId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v14

    const-string v14, "p_mMatchRecordId"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    move/from16 v28, v13

    const-string v13, "p_mDuration"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v0, "p_mDistance"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v29, v12

    const-string v12, "p_mStep"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    move/from16 v30, v11

    const-string v11, "p_mCalorie"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    move/from16 v31, v10

    const-string v10, "p_mSpeed"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    move/from16 v32, v9

    const-string v9, "p_mAvgBpm"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    move/from16 v33, v8

    const-string v8, "p_mMaxBpm"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    move/from16 v34, v7

    const-string v7, "p_mMaxSpeed"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    move/from16 v35, v6

    const-string v6, "p_mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    move/from16 v36, v5

    const-string v5, "p_mIsDelete"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    move/from16 v37, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v38

    if-eqz v38, :cond_4

    move/from16 v38, v3

    move-object/from16 v39, v4

    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v41, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v42, v3

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v43, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v44, v3

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v45, v3

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v46, v3

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v47, v3

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v48, v3

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v49, v3

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v50, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v51, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    new-instance v40, Lcom/sma/smartv3/db/entity/MatchPeriod;

    move/from16 v52, v3

    invoke-direct/range {v40 .. v52}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIII)V

    move-object/from16 v3, v40

    new-instance v4, Lcom/sma/smartv3/db/entity/MatchRecord;

    invoke-direct {v4}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>()V

    move/from16 v41, v5

    move/from16 v40, v6

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMId(I)V

    move/from16 v5, v38

    move/from16 v38, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMStart(J)V

    move/from16 v6, v37

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v7

    const/16 v37, 0x0

    if-eqz v7, :cond_0

    move-object/from16 v7, v37

    goto :goto_1

    :cond_0
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    :goto_1
    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMLocalTime(Ljava/lang/String;)V

    move/from16 v42, v6

    move/from16 v7, v36

    move/from16 v36, v5

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMType(I)V

    move/from16 v5, v35

    move/from16 v35, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPeriodListSize(I)V

    move/from16 v6, v34

    move/from16 v34, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMLogListSize(I)V

    move v8, v5

    move/from16 v7, v33

    move/from16 v33, v6

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsSync(I)V

    move/from16 v5, v32

    move/from16 v32, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsDelete(I)V

    move/from16 v6, v31

    move/from16 v31, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMSource(I)V

    move v8, v5

    move/from16 v7, v30

    move/from16 v30, v6

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsStopWatchData(I)V

    move/from16 v5, v29

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object/from16 v6, v37

    :goto_2
    move/from16 v29, v0

    move/from16 v43, v2

    move-object/from16 v0, p0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :goto_3
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToStopWatchList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMStopWatchList(Ljava/util/List;)V

    move/from16 v2, v28

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object/from16 v6, v37

    :goto_4
    move/from16 v28, v2

    goto :goto_5

    :cond_2
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :goto_5
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToTeamInfo(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMTeamInfo(Lcom/szabh/smable3/entity/BleMatchRecordTeam3;)V

    move/from16 v2, v27

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_6
    move/from16 v27, v2

    move-object/from16 v6, v37

    goto :goto_7

    :cond_3
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v37

    goto :goto_6

    :goto_7
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToWeather(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleWeather;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMWeather(Lcom/szabh/smable3/entity/BleWeather;)V

    move/from16 v2, p1

    move/from16 v37, v5

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMHomeTeamScore(I)V

    move/from16 v5, p2

    move/from16 v44, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMGuestTeamScore(I)V

    move/from16 v6, p3

    move/from16 p1, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMode(I)V

    move/from16 p2, v5

    move/from16 p3, v6

    move/from16 v7, v16

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinBpm(I)V

    move/from16 v16, v7

    move/from16 v5, v17

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMAirPressure(I)V

    move/from16 v6, v18

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPace(I)V

    move/from16 v17, v5

    move/from16 v18, v6

    move/from16 v7, v19

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxPace(I)V

    move/from16 v19, v7

    move/from16 v5, v20

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinPace(I)V

    move/from16 v6, v21

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMSpm(I)V

    move/from16 v20, v5

    move/from16 v21, v6

    move/from16 v7, v22

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxSpm(I)V

    move/from16 v22, v7

    move/from16 v5, v23

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinSpm(I)V

    move/from16 v6, v24

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMAltitude(I)V

    move/from16 v23, v5

    move/from16 v24, v6

    move/from16 v7, v25

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxAltitude(I)V

    move/from16 v25, v7

    move/from16 v5, v26

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinAltitude(I)V

    invoke-virtual {v4, v3}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPeriod(Lcom/sma/smartv3/db/entity/MatchPeriod;)V

    move-object/from16 v3, v39

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v3

    move/from16 v26, v5

    move/from16 v0, v29

    move/from16 v8, v34

    move/from16 v3, v36

    move/from16 v29, v37

    move/from16 v7, v38

    move/from16 v6, v40

    move/from16 v5, v41

    move/from16 v37, v42

    move/from16 v34, v33

    move/from16 v36, v35

    move/from16 v35, v31

    move/from16 v33, v32

    move/from16 v32, p1

    move/from16 p1, v2

    move/from16 v31, v30

    move/from16 v2, v43

    move/from16 v30, v44

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_4
    move-object v3, v4

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v3

    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OXO1(ILandroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 3

    const-string v0, "DELETE FROM MatchLog WHERE mMatchRecordId = ?"

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic XIi00iiXO(ILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 35

    const-string v0, "SELECT * FROM MatchLog WHERE mMatchRecordId = ?"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v0, 0x1

    move/from16 v2, p0

    int-to-long v2, v2

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "mMatchRecordId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mCountingTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mPeriodTime"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mPeriodNumber"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mType"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mCount"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mCancelType"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mTeam"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mPlayer"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mOtherType"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mStopWatchTotal"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mIsSync"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIsDelete"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v16

    if-eqz v16, :cond_0

    move/from16 p1, v14

    move-object/from16 v16, v15

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 v18, v14

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 v19, v14

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move v15, v2

    move/from16 v33, v3

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v21, v2

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v22, v2

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v23, v2

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v24, v2

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v25, v2

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v26, v2

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v27, v2

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v28, v2

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v29, v2

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v3, p1

    move/from16 p1, v4

    move/from16 v34, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    move/from16 v5, p0

    move/from16 v30, v2

    move/from16 p0, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v17, Lcom/sma/smartv3/db/entity/MatchLog;

    move/from16 v32, v2

    move/from16 v31, v4

    move/from16 v20, v14

    invoke-direct/range {v17 .. v32}, Lcom/sma/smartv3/db/entity/MatchLog;-><init>(IIIIIIIIIIIIIII)V

    move-object/from16 v2, v17

    move-object/from16 v3, v16

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v14, p0

    move/from16 v4, p1

    move/from16 p0, v5

    move v2, v15

    move/from16 v5, v34

    move-object v15, v3

    move/from16 v3, v33

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v3, v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v3

    :goto_1
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__updateAdapterOfMatchRecord:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 55

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT * FROM MatchRecord WHERE mIsDelete != 1"

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    const-string v2, "mId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mStart"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mType"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mPeriodListSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mLogListSize"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mIsSync"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mIsDelete"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mSource"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mIsStopWatchData"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mStopWatchList"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mTeamInfo"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mWeather"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mHomeTeamScore"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "mGuestTeamScore"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mMode"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mMinBpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mAirPressure"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mMaxPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mMinPace"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mMaxSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mMinSpm"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "mMaxAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    const-string v15, "mMinAltitude"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v28, v15

    const-string v15, "p_mId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v29, v14

    const-string v14, "p_mMatchRecordId"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    move/from16 v30, v13

    const-string v13, "p_mDuration"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v0, "p_mDistance"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    move/from16 v31, v12

    const-string v12, "p_mStep"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    move/from16 v32, v11

    const-string v11, "p_mCalorie"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    move/from16 v33, v10

    const-string v10, "p_mSpeed"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    move/from16 v34, v9

    const-string v9, "p_mAvgBpm"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    move/from16 v35, v8

    const-string v8, "p_mMaxBpm"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    move/from16 v36, v7

    const-string v7, "p_mMaxSpeed"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    move/from16 v37, v6

    const-string v6, "p_mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    move/from16 v38, v5

    const-string v5, "p_mIsDelete"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    move/from16 v39, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v40

    if-eqz v40, :cond_4

    move/from16 v40, v3

    move-object/from16 v41, v4

    invoke-interface {v1, v15}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v43, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v44, v3

    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v45, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v46, v3

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v47, v3

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v48, v3

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v49, v3

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v50, v3

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v51, v3

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v52, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    move/from16 v53, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    new-instance v42, Lcom/sma/smartv3/db/entity/MatchPeriod;

    move/from16 v54, v3

    invoke-direct/range {v42 .. v54}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIII)V

    move-object/from16 v3, v42

    new-instance v4, Lcom/sma/smartv3/db/entity/MatchRecord;

    invoke-direct {v4}, Lcom/sma/smartv3/db/entity/MatchRecord;-><init>()V

    move/from16 v43, v5

    move/from16 v42, v6

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMId(I)V

    move/from16 v5, v40

    move/from16 v40, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMStart(J)V

    move/from16 v6, v39

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v7

    const/16 v39, 0x0

    if-eqz v7, :cond_0

    move-object/from16 v7, v39

    goto :goto_1

    :cond_0
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    :goto_1
    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMLocalTime(Ljava/lang/String;)V

    move/from16 v44, v6

    move/from16 v7, v38

    move/from16 v38, v5

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMType(I)V

    move/from16 v5, v37

    move/from16 v37, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPeriodListSize(I)V

    move/from16 v6, v36

    move/from16 v36, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMLogListSize(I)V

    move v8, v5

    move/from16 v7, v35

    move/from16 v35, v6

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsSync(I)V

    move/from16 v5, v34

    move/from16 v34, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsDelete(I)V

    move/from16 v6, v33

    move/from16 v33, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMSource(I)V

    move v8, v5

    move/from16 v7, v32

    move/from16 v32, v6

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMIsStopWatchData(I)V

    move/from16 v5, v31

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object/from16 v6, v39

    :goto_2
    move/from16 v31, v0

    move/from16 v45, v2

    move-object/from16 v0, p0

    goto :goto_3

    :cond_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :goto_3
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToStopWatchList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMStopWatchList(Ljava/util/List;)V

    move/from16 v2, v30

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object/from16 v6, v39

    :goto_4
    move/from16 v30, v2

    goto :goto_5

    :cond_2
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :goto_5
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToTeamInfo(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleMatchRecordTeam3;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMTeamInfo(Lcom/szabh/smable3/entity/BleMatchRecordTeam3;)V

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_6
    move/from16 v29, v2

    move-object/from16 v6, v39

    goto :goto_7

    :cond_3
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v39

    goto :goto_6

    :goto_7
    iget-object v2, v0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    invoke-virtual {v2, v6}, Lcom/sma/smartv3/db/entity/MatchRecordConverter;->stringToWeather(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleWeather;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMWeather(Lcom/szabh/smable3/entity/BleWeather;)V

    move/from16 v2, p1

    move/from16 v39, v5

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMHomeTeamScore(I)V

    move/from16 v5, v16

    move/from16 v16, v7

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMGuestTeamScore(I)V

    move/from16 p1, v8

    move/from16 v6, v17

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMode(I)V

    move v8, v5

    move/from16 v17, v6

    move/from16 v7, v18

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinBpm(I)V

    move/from16 v18, v7

    move/from16 v5, v19

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMAirPressure(I)V

    move/from16 v19, v8

    move/from16 v6, v20

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPace(I)V

    move v8, v5

    move/from16 v20, v6

    move/from16 v7, v21

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxPace(I)V

    move/from16 v21, v7

    move/from16 v5, v22

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinPace(I)V

    move/from16 v22, v8

    move/from16 v6, v23

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMSpm(I)V

    move v8, v5

    move/from16 v23, v6

    move/from16 v7, v24

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxSpm(I)V

    move/from16 v24, v7

    move/from16 v5, v25

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinSpm(I)V

    move/from16 v25, v8

    move/from16 v6, v26

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMAltitude(I)V

    move v8, v5

    move/from16 v26, v6

    move/from16 v7, v27

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMaxAltitude(I)V

    move/from16 v27, v7

    move/from16 v5, v28

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4, v6}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMMinAltitude(I)V

    invoke-virtual {v4, v3}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPeriod(Lcom/sma/smartv3/db/entity/MatchPeriod;)V

    move-object/from16 v3, v41

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v3

    move/from16 v28, v5

    move/from16 v0, v31

    move/from16 v3, v38

    move/from16 v31, v39

    move/from16 v7, v40

    move/from16 v6, v42

    move/from16 v5, v43

    move/from16 v39, v44

    move/from16 v38, v37

    move/from16 v37, v33

    move/from16 v33, v32

    move/from16 v32, v16

    move/from16 v16, v19

    move/from16 v19, v22

    move/from16 v22, v25

    move/from16 v25, v8

    move/from16 v8, v36

    move/from16 v36, v35

    move/from16 v35, v34

    move/from16 v34, p1

    move/from16 p1, v2

    move/from16 v2, v45

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_4
    move-object v3, v4

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v3

    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)Lcom/sma/smartv3/db/entity/MatchRecordConverter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__matchRecordConverter:Lcom/sma/smartv3/db/entity/MatchRecordConverter;

    return-object p0
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

.method public static synthetic iO(ILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 29

    const-string v0, "SELECT * FROM MatchPeriod WHERE mMatchRecordId = ?"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v0, 0x1

    move/from16 v2, p0

    int-to-long v2, v2

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "mMatchRecordId"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mDuration"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mDistance"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mStep"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mCalorie"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mSpeed"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mAvgBpm"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mMaxBpm"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mMaxSpeed"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mIsSync"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mIsDelete"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v14

    if-eqz v14, :cond_0

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 v17, v14

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 v18, v14

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move/from16 p0, v2

    move/from16 p1, v3

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v20, v2

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v21, v2

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v22, v2

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v23, v2

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v24, v2

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v25, v2

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v26, v2

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v27, v2

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v16, Lcom/sma/smartv3/db/entity/MatchPeriod;

    move/from16 v28, v2

    move/from16 v19, v14

    invoke-direct/range {v16 .. v28}, Lcom/sma/smartv3/db/entity/MatchPeriod;-><init>(IIIIIIIIIIII)V

    move-object/from16 v2, v16

    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, p0

    move/from16 v3, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v13

    :goto_1
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method


# virtual methods
.method public _deleteMatchLogById(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "matchRecordId"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h50;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/h50;-><init>(I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public _deleteMatchPeriodById(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "matchRecordId"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/q50;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/q50;-><init>(I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public _deleteMatchRecordById(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/s50;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/s50;-><init>(I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public _getMatchLogById(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "matchRecordId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/p50;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/p50;-><init>(I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public _getMatchPeriodsById(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "matchRecordId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l50;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/l50;-><init>(I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public _getMatchRecords(II)Ljava/util/List;
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
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/o50;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/o50;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public _insertMatchLog(Ljava/util/List;)[J
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
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;)[J"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/m50;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/m50;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [J

    return-object p1
.end method

.method public _insertMatchPeriod(Ljava/util/List;)[J
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
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;)[J"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r50;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/r50;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [J

    return-object p1
.end method

.method public _insertMatchRecord(Lcom/sma/smartv3/db/entity/MatchRecord;)J
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "matchRecord"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j50;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/j50;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Lcom/sma/smartv3/db/entity/MatchRecord;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public delete(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao$DefaultImpls;->delete(Lcom/sma/smartv3/db/dao/MatchRecordDao;I)V

    return-void
.end method

.method public getList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k50;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/k50;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getListBySource(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "source"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/n50;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/n50;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getMatchRecords(II)Ljava/util/List;
    .locals 0
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
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/db/dao/MatchRecordDao$DefaultImpls;->getMatchRecords(Lcom/sma/smartv3/db/dao/MatchRecordDao;II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public insert(Ljava/util/List;)V
    .locals 0
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
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao$DefaultImpls;->insert(Lcom/sma/smartv3/db/dao/MatchRecordDao;Ljava/util/List;)V

    return-void
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
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i50;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/i50;-><init>(Lcom/sma/smartv3/db/dao/MatchRecordDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
