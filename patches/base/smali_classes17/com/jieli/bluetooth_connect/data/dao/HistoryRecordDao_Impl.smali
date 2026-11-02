.class public final Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deletionAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeletionOrUpdateAdapter<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertionAdapterOfHistoryRecord:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeletionOrUpdateAdapter<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "__db"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$1;-><init>(Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__insertionAdapterOfHistoryRecord:Landroidx/room/EntityInsertionAdapter;

    new-instance v0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$2;-><init>(Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__deletionAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;

    new-instance v0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$3;

    invoke-direct {v0, p0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl$3;-><init>(Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__updateAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;

    return-void
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
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


# virtual methods
.method public addHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "historyRecord"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    :try_start_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__insertionAdapterOfHistoryRecord:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    throw p1
.end method

.method public getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .locals 21
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "devAddress"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "SELECT * FROM HistoryRecord WHERE address LIKE ? OR mapped_address LIKE ? OR update_address LIKE ? ORDER BY online_time DESC LIMIT 1"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v2

    const/4 v4, 0x1

    if-nez v0, :cond_0

    invoke-virtual {v2, v4}, Landroidx/room/RoomSQLiteQuery;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v4, v0}, Landroidx/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    :goto_0
    const/4 v4, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v2, v4}, Landroidx/room/RoomSQLiteQuery;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v4, v0}, Landroidx/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    :goto_1
    if-nez v0, :cond_2

    invoke-virtual {v2, v3}, Landroidx/room/RoomSQLiteQuery;->bindNull(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v3, v0}, Landroidx/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    :goto_2
    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    :try_start_0
    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v0, "id"

    invoke-static {v3, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "name"

    invoke-static {v3, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "address"

    invoke-static {v3, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mapped_address"

    invoke-static {v3, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "dev_type"

    invoke-static {v3, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "connect_type"

    invoke-static {v3, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "sdk_flag"

    invoke-static {v3, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "vid"

    invoke-static {v3, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "uid"

    invoke-static {v3, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "pid"

    invoke-static {v3, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "left_dev_lat"

    invoke-static {v3, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "left_dev_lon"

    invoke-static {v3, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v4, "left_dev_update_time"

    invoke-static {v3, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v16, v2

    :try_start_2
    const-string v2, "right_dev_lat"

    invoke-static {v3, v2}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    const-string v1, "right_dev_lon"

    invoke-static {v3, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "right_dev_update_time"

    invoke-static {v3, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "online_time"

    invoke-static {v3, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "update_address"

    invoke-static {v3, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v20

    if-eqz v20, :cond_7

    move/from16 v20, v1

    new-instance v1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    invoke-direct {v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;-><init>()V

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setId(I)V

    invoke-interface {v3, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setName(Ljava/lang/String;)V

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_4

    :cond_4
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setAddress(Ljava/lang/String;)V

    invoke-interface {v3, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    goto :goto_5

    :cond_5
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setMappedAddress(Ljava/lang/String;)V

    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setDevType(I)V

    invoke-interface {v3, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setConnectType(I)V

    invoke-interface {v3, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setSdkFlag(I)V

    invoke-interface {v3, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setVid(I)V

    invoke-interface {v3, v12}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setUid(I)V

    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setPid(I)V

    invoke-interface {v3, v14}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setLeftDevLatitude(D)V

    invoke-interface {v3, v15}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setLeftDevLongitude(D)V

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setLeftDevUpdateTime(J)V

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setRightDevLatitude(D)V

    move/from16 v0, v17

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setRightDevLongitude(D)V

    move/from16 v0, v18

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setRightDevUpdateTime(J)V

    move/from16 v0, v19

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setOnlineTime(J)V

    move/from16 v0, v20

    invoke-interface {v3, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v4, 0x0

    goto :goto_6

    :cond_6
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_6
    invoke-virtual {v1, v4}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setUpdateAddress(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v4, v1

    :goto_7
    move-object/from16 v1, p0

    goto :goto_8

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_9

    :cond_7
    const/4 v4, 0x0

    goto :goto_7

    :goto_8
    :try_start_4
    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-object v4

    :catchall_1
    move-exception v0

    goto :goto_a

    :catchall_2
    move-exception v0

    goto :goto_9

    :catchall_3
    move-exception v0

    move-object/from16 v16, v2

    :goto_9
    :try_start_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_a
    iget-object v2, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    throw v0
.end method

.method public getHistoryRecordList()Ljava/util/List;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM HistoryRecord ORDER BY online_time DESC"

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v3

    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    :try_start_0
    iget-object v0, v1, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    :try_start_1
    const-string v0, "id"

    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "name"

    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "address"

    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mapped_address"

    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "dev_type"

    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "connect_type"

    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "sdk_flag"

    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "vid"

    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "uid"

    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "pid"

    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "left_dev_lat"

    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "left_dev_lon"

    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v4, "left_dev_update_time"

    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-object/from16 v16, v3

    :try_start_2
    const-string v3, "right_dev_lat"

    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    const-string v1, "right_dev_lon"

    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "right_dev_update_time"

    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "online_time"

    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "update_address"

    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    new-instance v1, Ljava/util/ArrayList;

    move/from16 v21, v3

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    invoke-direct {v3}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;-><init>()V

    move-object/from16 v22, v1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setId(I)V

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setName(Ljava/lang/String;)V

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setAddress(Ljava/lang/String;)V

    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setMappedAddress(Ljava/lang/String;)V

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setDevType(I)V

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setConnectType(I)V

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setSdkFlag(I)V

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setVid(I)V

    invoke-interface {v2, v12}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setUid(I)V

    invoke-interface {v2, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setPid(I)V

    move/from16 v23, v0

    invoke-interface {v2, v14}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setLeftDevLatitude(D)V

    invoke-interface {v2, v15}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setLeftDevLongitude(D)V

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setLeftDevUpdateTime(J)V

    move v1, v5

    move/from16 v0, v21

    move/from16 v21, v4

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setRightDevLatitude(D)V

    move v5, v0

    move/from16 v4, v17

    move/from16 v17, v1

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setRightDevLongitude(D)V

    move v1, v4

    move/from16 v0, v18

    move/from16 v18, v5

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setRightDevUpdateTime(J)V

    move v5, v0

    move/from16 v4, v19

    move/from16 v19, v1

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setOnlineTime(J)V

    move/from16 v0, v20

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_4
    invoke-virtual {v3, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setUpdateAddress(Ljava/lang/String;)V

    move-object/from16 v1, v22

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move/from16 v20, v19

    move/from16 v19, v4

    move/from16 v4, v21

    move/from16 v21, v18

    move/from16 v18, v5

    move/from16 v5, v17

    move/from16 v17, v20

    move/from16 v20, v0

    move/from16 v0, v23

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object/from16 v3, p0

    goto :goto_6

    :cond_4
    move-object/from16 v3, p0

    :try_start_4
    iget-object v0, v3, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v0, v3, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-object v1

    :catchall_1
    move-exception v0

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_6

    :catchall_3
    move-exception v0

    :goto_5
    move-object v3, v1

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object/from16 v16, v3

    goto :goto_5

    :goto_6
    :try_start_6
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v16 .. v16}, Landroidx/room/RoomSQLiteQuery;->release()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_5
    move-exception v0

    move-object v3, v1

    :goto_7
    iget-object v1, v3, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    throw v0
.end method

.method public removeHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "historyRecord"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    :try_start_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__deletionAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityDeletionOrUpdateAdapter;->handle(Ljava/lang/Object;)I

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    throw p1
.end method

.method public removeHistoryRecords(Ljava/util/List;)V
    .locals 1
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
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    :try_start_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__deletionAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityDeletionOrUpdateAdapter;->handleMultiple(Ljava/lang/Iterable;)I

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    throw p1
.end method

.method public updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "record"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    :try_start_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__updateAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityDeletionOrUpdateAdapter;->handle(Ljava/lang/Object;)I

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    throw p1
.end method

.method public updateHistoryRecords(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "records"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    :try_start_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__updateAdapterOfHistoryRecord:Landroidx/room/EntityDeletionOrUpdateAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityDeletionOrUpdateAdapter;->handleMultiple(Ljava/lang/Iterable;)I

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    throw p1
.end method
