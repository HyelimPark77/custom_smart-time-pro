.class public final Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deleteAdapterOfRecordDeviceFile:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfRecordDeviceFile:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfRecordDeviceFile:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 0
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

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__insertAdapterOfRecordDeviceFile:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$2;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__deleteAdapterOfRecordDeviceFile:Landroidx/room/EntityDeleteOrUpdateAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$3;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl$3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__updateAdapterOfRecordDeviceFile:Landroidx/room/EntityDeleteOrUpdateAdapter;

    return-void
.end method

.method public static synthetic I0IIOi(JLandroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/RecordDeviceFile;
    .locals 29

    const-string v0, "SELECT * FROM RecordDeviceFile WHERE mId = ?"

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v0, 0x1

    move-wide/from16 v2, p0

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "mTime"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mLocalTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mName"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mPath"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mWidth"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mHeight"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mDuration"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mThumbnail"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mFileType"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mIsFavority"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mContent"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mIsSync"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIsDelete"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "mProcessType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "mProcessStatus"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p2, v15

    const-string v15, "mProcessPath"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mIsRead"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mIsConversion"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mReservedTextType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mReservedText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mIsSummaryReport"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mSummaryReportText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mFileName"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mTaskId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mModel"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v25

    const/16 v26, 0x0

    if-eqz v25, :cond_a

    move/from16 v25, v15

    new-instance v15, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    invoke-direct {v15}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>()V

    move/from16 v27, v13

    move/from16 v28, v14

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMId(J)V

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTime(J)V

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v0, v26

    goto :goto_0

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMLocalTime(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, v26

    goto :goto_1

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMName(Ljava/lang/String;)V

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v0, v26

    goto :goto_2

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMPath(Ljava/lang/String;)V

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSize(J)V

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMWidth(I)V

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMHeight(I)V

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMDuration(J)V

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v0, v26

    goto :goto_3

    :cond_3
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMThumbnail(Ljava/lang/String;)V

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileType(I)V

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsFavority(I)V

    move/from16 v0, v27

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object/from16 v0, v26

    goto :goto_4

    :cond_4
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMContent(Ljava/lang/String;)V

    move/from16 v0, v28

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSync(I)V

    move/from16 v0, p0

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsDelete(I)V

    move/from16 v0, p1

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessType(I)V

    move/from16 v0, p2

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessStatus(I)V

    move/from16 v0, v16

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v0, v26

    goto :goto_5

    :cond_5
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessPath(Ljava/lang/String;)V

    move/from16 v0, v17

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsRead(I)V

    move/from16 v0, v18

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsConversion(I)V

    move/from16 v0, v19

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedTextType(I)V

    move/from16 v0, v20

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v0, v26

    goto :goto_6

    :cond_6
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedText(Ljava/lang/String;)V

    move/from16 v0, v21

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSummaryReport(I)V

    move/from16 v0, v22

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 v0, v26

    goto :goto_7

    :cond_7
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSummaryReportText(Ljava/lang/String;)V

    move/from16 v0, v23

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object/from16 v0, v26

    goto :goto_8

    :cond_8
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    :goto_8
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileName(Ljava/lang/String;)V

    move/from16 v0, v24

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_9

    :goto_9
    move-object/from16 v0, v26

    goto :goto_a

    :cond_9
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v26

    goto :goto_9

    :goto_a
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTaskId(Ljava/lang/String;)V

    move/from16 v0, v25

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMModel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v26, v15

    goto :goto_b

    :catchall_0
    move-exception v0

    goto :goto_c

    :cond_a
    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v26

    :goto_c
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)[J
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__insertAdapterOfRecordDeviceFile:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnIdsArray(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__deleteAdapterOfRecordDeviceFile:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic O00(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 32

    const-string v0, "SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 4 OR mFileType == 5 ORDER BY mTime DESC"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "mTime"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mLocalTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mName"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mPath"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mWidth"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mHeight"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mDuration"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mThumbnail"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mFileType"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mIsFavority"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mContent"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mIsSync"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIsDelete"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "mProcessType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mProcessStatus"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mProcessPath"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mIsRead"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mIsConversion"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mReservedTextType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mReservedText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mIsSummaryReport"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mSummaryReportText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mFileName"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mTaskId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "mModel"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v28

    if-eqz v28, :cond_a

    move-object/from16 v28, v15

    new-instance v15, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    invoke-direct {v15}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>()V

    move/from16 v29, v13

    move/from16 v30, v14

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMId(J)V

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTime(J)V

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_1
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMLocalTime(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_2
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMName(Ljava/lang/String;)V

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_3
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMPath(Ljava/lang/String;)V

    move v13, v2

    move/from16 v31, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSize(J)V

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMWidth(I)V

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMHeight(I)V

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMDuration(J)V

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMThumbnail(Ljava/lang/String;)V

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileType(I)V

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsFavority(I)V

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_5
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMContent(Ljava/lang/String;)V

    move-object/from16 v29, v15

    move/from16 v3, v30

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move-object/from16 v15, v29

    invoke-virtual {v15, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSync(I)V

    move/from16 v14, p0

    move/from16 v29, v2

    move/from16 p0, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsDelete(I)V

    move/from16 v2, v16

    move/from16 v16, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessType(I)V

    move/from16 v3, v17

    move/from16 v17, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessStatus(I)V

    move/from16 v4, v18

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessPath(Ljava/lang/String;)V

    move/from16 v18, v2

    move/from16 v5, v19

    move/from16 v19, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsRead(I)V

    move/from16 v2, v20

    move/from16 v20, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsConversion(I)V

    move/from16 v3, v21

    move/from16 v21, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedTextType(I)V

    move/from16 v4, v22

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_7
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedText(Ljava/lang/String;)V

    move/from16 v22, v2

    move/from16 v5, v23

    move/from16 v23, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSummaryReport(I)V

    move/from16 v2, v24

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_8
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSummaryReportText(Ljava/lang/String;)V

    move/from16 v3, v25

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_8

    move/from16 v25, v0

    const/4 v0, 0x0

    goto :goto_9

    :cond_8
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v24

    move/from16 v25, v0

    move-object/from16 v0, v24

    :goto_9
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileName(Ljava/lang/String;)V

    move/from16 v0, v26

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_9

    move/from16 v26, v0

    const/4 v0, 0x0

    goto :goto_a

    :cond_9
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v24

    move/from16 v26, v0

    move-object/from16 v0, v24

    :goto_a
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTaskId(Ljava/lang/String;)V

    move/from16 v24, v2

    move/from16 v0, v27

    move/from16 v27, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMModel(I)V

    move-object/from16 v2, v28

    invoke-interface {v2, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v14

    move/from16 v14, p0

    move/from16 p0, v3

    move/from16 v3, v27

    move/from16 v27, v0

    move/from16 v0, v25

    move/from16 v25, v3

    move/from16 v3, v22

    move/from16 v22, v4

    move/from16 v4, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v3

    move/from16 v3, v23

    move/from16 v23, v5

    move/from16 v5, v17

    move/from16 v17, v19

    move/from16 v19, v21

    move/from16 v21, v3

    move-object v15, v2

    move v2, v13

    move/from16 v13, v29

    move/from16 v3, v31

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_a
    move-object v2, v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v2

    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OIX0iXi(Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM RecordDeviceFile"

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OIi0(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 31

    move-object/from16 v0, p0

    const-string v1, "\n        SELECT * FROM RecordDeviceFile \n        WHERE LOWER(mName) LIKE \'%.aac\' \n        AND SUBSTR(mName, 1, LENGTH(mName) - 4) LIKE \'%\' || ? || \'%\' COLLATE NOCASE \n        ORDER BY mTime DESC\n        "

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_0
    invoke-interface {v1, v2, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "mTime"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mLocalTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mName"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mPath"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mWidth"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mHeight"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mDuration"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mThumbnail"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mFileType"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mIsFavority"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mContent"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mIsSync"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIsDelete"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "mProcessType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "mProcessStatus"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mProcessPath"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mIsRead"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mIsConversion"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mReservedTextType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mReservedText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mIsSummaryReport"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mSummaryReportText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mFileName"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mTaskId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mModel"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v27

    if-eqz v27, :cond_b

    move-object/from16 v27, v15

    new-instance v15, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    invoke-direct {v15}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>()V

    move/from16 v28, v13

    move/from16 v29, v14

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMId(J)V

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTime(J)V

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_2
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMLocalTime(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_3
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMName(Ljava/lang/String;)V

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_3

    const/4 v13, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_4
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMPath(Ljava/lang/String;)V

    move v13, v2

    move/from16 v30, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSize(J)V

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMWidth(I)V

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMHeight(I)V

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMDuration(J)V

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v2

    :goto_5
    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMThumbnail(Ljava/lang/String;)V

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileType(I)V

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsFavority(I)V

    move/from16 v2, v28

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_6
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMContent(Ljava/lang/String;)V

    move-object/from16 v28, v15

    move/from16 v3, v29

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move-object/from16 v15, v28

    invoke-virtual {v15, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSync(I)V

    move/from16 v14, p0

    move/from16 v28, v2

    move/from16 p0, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsDelete(I)V

    move/from16 v2, p1

    move/from16 p1, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessType(I)V

    move/from16 v3, v16

    move/from16 v16, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessStatus(I)V

    move/from16 v4, v17

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_7
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessPath(Ljava/lang/String;)V

    move/from16 v17, v2

    move/from16 v5, v18

    move/from16 v18, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsRead(I)V

    move/from16 v2, v19

    move/from16 v19, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsConversion(I)V

    move/from16 v3, v20

    move/from16 v20, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedTextType(I)V

    move/from16 v4, v21

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v5, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_8
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedText(Ljava/lang/String;)V

    move/from16 v21, v2

    move/from16 v5, v22

    move/from16 v22, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSummaryReport(I)V

    move/from16 v2, v23

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x0

    goto :goto_9

    :cond_8
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_9
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSummaryReportText(Ljava/lang/String;)V

    move/from16 v3, v24

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_9

    move/from16 v24, v0

    const/4 v0, 0x0

    goto :goto_a

    :cond_9
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v23

    move/from16 v24, v0

    move-object/from16 v0, v23

    :goto_a
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileName(Ljava/lang/String;)V

    move/from16 v0, v25

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_a

    move/from16 v25, v0

    const/4 v0, 0x0

    goto :goto_b

    :cond_a
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v23

    move/from16 v25, v0

    move-object/from16 v0, v23

    :goto_b
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTaskId(Ljava/lang/String;)V

    move/from16 v23, v2

    move/from16 v0, v26

    move/from16 v26, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMModel(I)V

    move-object/from16 v2, v27

    invoke-interface {v2, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v14

    move/from16 v14, p0

    move/from16 p0, v3

    move v3, v4

    move/from16 v4, p1

    move/from16 p1, v17

    move/from16 v17, v19

    move/from16 v19, v21

    move/from16 v21, v3

    move/from16 v3, v26

    move/from16 v26, v0

    move/from16 v0, v24

    move/from16 v24, v3

    move/from16 v3, v22

    move/from16 v22, v5

    move/from16 v5, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v3

    move-object v15, v2

    move v2, v13

    move/from16 v13, v28

    move/from16 v3, v30

    goto/16 :goto_1

    :cond_b
    move-object v2, v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v2

    :goto_c
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OXO1(JLandroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM RecordDeviceFile WHERE mId = ?"

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

.method public static synthetic XIi00iiXO(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 32

    const-string v0, "SELECT * FROM RecordDeviceFile WHERE mIsFavority == 1 ORDER BY mTime DESC"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "mTime"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mLocalTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mName"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mPath"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mWidth"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mHeight"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mDuration"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mThumbnail"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mFileType"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mIsFavority"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mContent"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mIsSync"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIsDelete"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "mProcessType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mProcessStatus"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mProcessPath"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mIsRead"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mIsConversion"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mReservedTextType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mReservedText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mIsSummaryReport"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mSummaryReportText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mFileName"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mTaskId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "mModel"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v28

    if-eqz v28, :cond_a

    move-object/from16 v28, v15

    new-instance v15, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    invoke-direct {v15}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>()V

    move/from16 v29, v13

    move/from16 v30, v14

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMId(J)V

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTime(J)V

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_1
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMLocalTime(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_2
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMName(Ljava/lang/String;)V

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_3
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMPath(Ljava/lang/String;)V

    move v13, v2

    move/from16 v31, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSize(J)V

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMWidth(I)V

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMHeight(I)V

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMDuration(J)V

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMThumbnail(Ljava/lang/String;)V

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileType(I)V

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsFavority(I)V

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_5
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMContent(Ljava/lang/String;)V

    move-object/from16 v29, v15

    move/from16 v3, v30

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move-object/from16 v15, v29

    invoke-virtual {v15, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSync(I)V

    move/from16 v14, p0

    move/from16 v29, v2

    move/from16 p0, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsDelete(I)V

    move/from16 v2, v16

    move/from16 v16, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessType(I)V

    move/from16 v3, v17

    move/from16 v17, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessStatus(I)V

    move/from16 v4, v18

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessPath(Ljava/lang/String;)V

    move/from16 v18, v2

    move/from16 v5, v19

    move/from16 v19, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsRead(I)V

    move/from16 v2, v20

    move/from16 v20, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsConversion(I)V

    move/from16 v3, v21

    move/from16 v21, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedTextType(I)V

    move/from16 v4, v22

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_7
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedText(Ljava/lang/String;)V

    move/from16 v22, v2

    move/from16 v5, v23

    move/from16 v23, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSummaryReport(I)V

    move/from16 v2, v24

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_8
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSummaryReportText(Ljava/lang/String;)V

    move/from16 v3, v25

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_8

    move/from16 v25, v0

    const/4 v0, 0x0

    goto :goto_9

    :cond_8
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v24

    move/from16 v25, v0

    move-object/from16 v0, v24

    :goto_9
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileName(Ljava/lang/String;)V

    move/from16 v0, v26

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_9

    move/from16 v26, v0

    const/4 v0, 0x0

    goto :goto_a

    :cond_9
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v24

    move/from16 v26, v0

    move-object/from16 v0, v24

    :goto_a
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTaskId(Ljava/lang/String;)V

    move/from16 v24, v2

    move/from16 v0, v27

    move/from16 v27, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMModel(I)V

    move-object/from16 v2, v28

    invoke-interface {v2, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v14

    move/from16 v14, p0

    move/from16 p0, v3

    move/from16 v3, v27

    move/from16 v27, v0

    move/from16 v0, v25

    move/from16 v25, v3

    move/from16 v3, v22

    move/from16 v22, v4

    move/from16 v4, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v3

    move/from16 v3, v23

    move/from16 v23, v5

    move/from16 v5, v17

    move/from16 v17, v19

    move/from16 v19, v21

    move/from16 v21, v3

    move-object v15, v2

    move v2, v13

    move/from16 v13, v29

    move/from16 v3, v31

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_a
    move-object v2, v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v2

    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic XO0O10(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 32

    const-string v0, "SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 5 ORDER BY mTime DESC"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "mTime"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mLocalTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mName"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mPath"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mWidth"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mHeight"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mDuration"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mThumbnail"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mFileType"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mIsFavority"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mContent"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mIsSync"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIsDelete"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "mProcessType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mProcessStatus"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mProcessPath"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mIsRead"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mIsConversion"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mReservedTextType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mReservedText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mIsSummaryReport"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mSummaryReportText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mFileName"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mTaskId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    const-string v15, "mModel"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v27, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v28

    if-eqz v28, :cond_a

    move-object/from16 v28, v15

    new-instance v15, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    invoke-direct {v15}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>()V

    move/from16 v29, v13

    move/from16 v30, v14

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMId(J)V

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTime(J)V

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_1
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMLocalTime(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_2
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMName(Ljava/lang/String;)V

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_3
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMPath(Ljava/lang/String;)V

    move v13, v2

    move/from16 v31, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSize(J)V

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMWidth(I)V

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMHeight(I)V

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMDuration(J)V

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMThumbnail(Ljava/lang/String;)V

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileType(I)V

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsFavority(I)V

    move/from16 v2, v29

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_5
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMContent(Ljava/lang/String;)V

    move-object/from16 v29, v15

    move/from16 v3, v30

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move-object/from16 v15, v29

    invoke-virtual {v15, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSync(I)V

    move/from16 v14, p0

    move/from16 v29, v2

    move/from16 p0, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsDelete(I)V

    move/from16 v2, v16

    move/from16 v16, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessType(I)V

    move/from16 v3, v17

    move/from16 v17, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessStatus(I)V

    move/from16 v4, v18

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessPath(Ljava/lang/String;)V

    move/from16 v18, v2

    move/from16 v5, v19

    move/from16 v19, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsRead(I)V

    move/from16 v2, v20

    move/from16 v20, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsConversion(I)V

    move/from16 v3, v21

    move/from16 v21, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedTextType(I)V

    move/from16 v4, v22

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_7
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedText(Ljava/lang/String;)V

    move/from16 v22, v2

    move/from16 v5, v23

    move/from16 v23, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSummaryReport(I)V

    move/from16 v2, v24

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_8
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSummaryReportText(Ljava/lang/String;)V

    move/from16 v3, v25

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_8

    move/from16 v25, v0

    const/4 v0, 0x0

    goto :goto_9

    :cond_8
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v24

    move/from16 v25, v0

    move-object/from16 v0, v24

    :goto_9
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileName(Ljava/lang/String;)V

    move/from16 v0, v26

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_9

    move/from16 v26, v0

    const/4 v0, 0x0

    goto :goto_a

    :cond_9
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v24

    move/from16 v26, v0

    move-object/from16 v0, v24

    :goto_a
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTaskId(Ljava/lang/String;)V

    move/from16 v24, v2

    move/from16 v0, v27

    move/from16 v27, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMModel(I)V

    move-object/from16 v2, v28

    invoke-interface {v2, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v14

    move/from16 v14, p0

    move/from16 p0, v3

    move/from16 v3, v27

    move/from16 v27, v0

    move/from16 v0, v25

    move/from16 v25, v3

    move/from16 v3, v22

    move/from16 v22, v4

    move/from16 v4, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v3

    move/from16 v3, v23

    move/from16 v23, v5

    move/from16 v5, v17

    move/from16 v17, v19

    move/from16 v19, v21

    move/from16 v21, v3

    move-object v15, v2

    move v2, v13

    move/from16 v13, v29

    move/from16 v3, v31

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_a
    move-object v2, v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v2

    :goto_b
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic XOO0ii0(ILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 31

    const-string v0, "SELECT * FROM RecordDeviceFile WHERE mFileType == ? ORDER BY mTime DESC"

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

    const-string v2, "mTime"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mLocalTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mName"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mPath"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mSize"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mWidth"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mHeight"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mDuration"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mThumbnail"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mFileType"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mIsFavority"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "mContent"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mIsSync"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "mIsDelete"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "mProcessType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "mProcessStatus"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "mProcessPath"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "mIsRead"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "mIsConversion"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "mReservedTextType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "mReservedText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    const-string v15, "mIsSummaryReport"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v22, v15

    const-string v15, "mSummaryReportText"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v23, v15

    const-string v15, "mFileName"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v24, v15

    const-string v15, "mTaskId"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v25, v15

    const-string v15, "mModel"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v26, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v27

    if-eqz v27, :cond_a

    move-object/from16 v27, v15

    new-instance v15, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    invoke-direct {v15}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>()V

    move/from16 v28, v13

    move/from16 v29, v14

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMId(J)V

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v15, v13, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTime(J)V

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_1
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMLocalTime(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_2
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMName(Ljava/lang/String;)V

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    :goto_3
    invoke-virtual {v15, v13}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMPath(Ljava/lang/String;)V

    move v13, v2

    move/from16 v30, v3

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSize(J)V

    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMWidth(I)V

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMHeight(I)V

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v15, v2, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMDuration(J)V

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMThumbnail(Ljava/lang/String;)V

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileType(I)V

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsFavority(I)V

    move/from16 v2, v28

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_5
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMContent(Ljava/lang/String;)V

    move-object/from16 v28, v15

    move/from16 v3, v29

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    move-object/from16 v15, v28

    invoke-virtual {v15, v14}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSync(I)V

    move/from16 v14, p0

    move/from16 v28, v2

    move/from16 p0, v3

    invoke-interface {v1, v14}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsDelete(I)V

    move/from16 v2, p1

    move/from16 p1, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessType(I)V

    move/from16 v3, v16

    move/from16 v16, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessStatus(I)V

    move/from16 v4, v17

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMProcessPath(Ljava/lang/String;)V

    move/from16 v17, v2

    move/from16 v5, v18

    move/from16 v18, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsRead(I)V

    move/from16 v2, v19

    move/from16 v19, v4

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsConversion(I)V

    move/from16 v3, v20

    move/from16 v20, v5

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v15, v4}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedTextType(I)V

    move/from16 v4, v21

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    :goto_7
    invoke-virtual {v15, v5}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMReservedText(Ljava/lang/String;)V

    move/from16 v21, v2

    move/from16 v5, v22

    move/from16 v22, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMIsSummaryReport(I)V

    move/from16 v2, v23

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    :goto_8
    invoke-virtual {v15, v3}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMSummaryReportText(Ljava/lang/String;)V

    move/from16 v3, v24

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_8

    move/from16 v24, v0

    const/4 v0, 0x0

    goto :goto_9

    :cond_8
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v23

    move/from16 v24, v0

    move-object/from16 v0, v23

    :goto_9
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMFileName(Ljava/lang/String;)V

    move/from16 v0, v25

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_9

    move/from16 v25, v0

    const/4 v0, 0x0

    goto :goto_a

    :cond_9
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v23

    move/from16 v25, v0

    move-object/from16 v0, v23

    :goto_a
    invoke-virtual {v15, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMTaskId(Ljava/lang/String;)V

    move/from16 v23, v2

    move/from16 v0, v26

    move/from16 v26, v3

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->setMModel(I)V

    move-object/from16 v2, v27

    invoke-interface {v2, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v14

    move/from16 v14, p0

    move/from16 p0, v3

    move v3, v4

    move/from16 v4, p1

    move/from16 p1, v17

    move/from16 v17, v19

    move/from16 v19, v21

    move/from16 v21, v3

    move/from16 v3, v26

    move/from16 v26, v0

    move/from16 v0, v24

    move/from16 v24, v3

    move/from16 v3, v22

    move/from16 v22, v5

    move/from16 v5, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v3

    move-object v15, v2

    move v2, v13

    move/from16 v13, v28

    move/from16 v3, v30

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_a
    move-object v2, v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v2

    :goto_b
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

.method public static synthetic iO(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__updateAdapterOfRecordDeviceFile:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public delete(Ljava/util/List;)V
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
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kc3;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/kc3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public deleteAll()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ic3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/ic3;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public deleteById(J)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mc3;

    invoke-direct {v1, p1, p2}, Lcom/android/mltcode/paycertificationapi/mc3;-><init>(J)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public getAlbumListAll()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lc3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/lc3;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getDeviceFiletById(J)Lcom/sma/smartv3/db/entity/RecordDeviceFile;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jc3;

    invoke-direct {v1, p1, p2}, Lcom/android/mltcode/paycertificationapi/jc3;-><init>(J)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    return-object p1
.end method

.method public getFavorityList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cc3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/cc3;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getListAll()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dc3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/dc3;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getListByType(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "fileType"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hc3;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/hc3;-><init>(I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

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
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;)[J"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ec3;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/ec3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [J

    return-object p1
.end method

.method public searchByNameIgnoreCase(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "keyword"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gc3;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/gc3;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

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
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fc3;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/fc3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
