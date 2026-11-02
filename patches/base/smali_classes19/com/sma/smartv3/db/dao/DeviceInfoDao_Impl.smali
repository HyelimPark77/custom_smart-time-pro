.class public final Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/DeviceInfoDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deleteAdapterOfRecordDeviceInfo:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfRecordDeviceInfo:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfRecordDeviceInfo:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
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

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__insertAdapterOfRecordDeviceInfo:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl$2;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__deleteAdapterOfRecordDeviceInfo:Landroidx/room/EntityDeleteOrUpdateAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl$3;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl$3;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__updateAdapterOfRecordDeviceInfo:Landroidx/room/EntityDeleteOrUpdateAdapter;

    return-void
.end method

.method public static synthetic I0IIOi(Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "SELECT EXISTS(SELECT 1 FROM RecordDeviceInfo LIMIT 1)"

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v0

    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic I0iXXO(Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "UPDATE RecordDeviceInfo SET isActive = 0"

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    invoke-static {p0}, Landroidx/room/util/SQLiteConnectionUtil;->getTotalChangedRows(Landroidx/sqlite/SQLiteConnection;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Lcom/sma/smartv3/db/entity/RecordDeviceInfo;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__deleteAdapterOfRecordDeviceInfo:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Lcom/sma/smartv3/db/entity/RecordDeviceInfo;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__insertAdapterOfRecordDeviceInfo:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnId(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "SELECT COUNT(*) FROM RecordDeviceInfo"

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v0

    :goto_1
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OIX0iXi(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 31

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM RecordDeviceInfo WHERE mMac = ?"

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

    goto/16 :goto_8

    :cond_0
    invoke-interface {v1, v2, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    const-string v0, "mId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v3, "mTime"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mLocalTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mMac"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mName"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mVersion"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mBattery"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mTotalStorage"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mAvailableStorage"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "isActive"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "mVoltage"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v13

    const/4 v14, 0x0

    if-eqz v13, :cond_6

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v16

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v18

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v20, v14

    goto :goto_1

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v20, v0

    :goto_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v21, v14

    goto :goto_2

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v21, v0

    :goto_2
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v22, v14

    goto :goto_3

    :cond_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v22, v0

    :goto_3
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_4
    move-object/from16 v23, v14

    goto :goto_5

    :cond_4
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v14

    goto :goto_4

    :goto_5
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v0, v3

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v25

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v27

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_5

    :goto_6
    move/from16 v29, v2

    goto :goto_7

    :cond_5
    const/4 v2, 0x0

    goto :goto_6

    :goto_7
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v15, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move/from16 v24, v0

    move/from16 v30, v2

    invoke-direct/range {v15 .. v30}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v14, v15

    :cond_6
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v14

    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OIi0(Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "DELETE FROM RecordDeviceInfo"

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    invoke-static {p0}, Landroidx/room/util/SQLiteConnectionUtil;->getTotalChangedRows(Landroidx/sqlite/SQLiteConnection;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Lcom/sma/smartv3/db/entity/RecordDeviceInfo;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__updateAdapterOfRecordDeviceInfo:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "UPDATE RecordDeviceInfo SET isActive = 1 WHERE mMac = ?"

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-interface {v0, v1, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    invoke-static {p1}, Landroidx/room/util/SQLiteConnectionUtil;->getTotalChangedRows(Landroidx/sqlite/SQLiteConnection;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object p0

    :goto_1
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->setActiveDevice(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic XO0O10(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM RecordDeviceInfo WHERE mMac = ?"

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {v0, v1}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-interface {v0, v1, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    invoke-static {p1}, Landroidx/room/util/SQLiteConnectionUtil;->getTotalChangedRows(Landroidx/sqlite/SQLiteConnection;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object p0

    :goto_1
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic XOO0ii0(Landroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 30

    const-string v0, "SELECT * FROM RecordDeviceInfo ORDER BY isActive DESC, mId ASC LIMIT 1"

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

    const-string v4, "mMac"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mName"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mVersion"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mBattery"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mTotalStorage"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mAvailableStorage"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "isActive"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mVoltage"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_5

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v15

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v17

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v19, v13

    goto :goto_0

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v0

    :goto_0
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v20, v13

    goto :goto_1

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v20, v0

    :goto_1
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v21, v13

    goto :goto_2

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v21, v0

    :goto_2
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_3
    move-object/from16 v22, v13

    goto :goto_4

    :cond_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_3

    :goto_4
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v24

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v26

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    :goto_5
    move/from16 v28, v2

    goto :goto_6

    :cond_4
    const/4 v2, 0x0

    goto :goto_5

    :goto_6
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v14, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move/from16 v23, v0

    move/from16 v29, v2

    invoke-direct/range {v14 .. v29}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v13, v14

    goto :goto_7

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_5
    :goto_7
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v13

    :goto_8
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic XXI(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 31

    const-string v0, "SELECT * FROM RecordDeviceInfo"

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

    const-string v4, "mMac"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mName"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mVersion"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "mBattery"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "mTotalStorage"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "mAvailableStorage"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "isActive"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "mVoltage"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v15

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v17

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    const/4 v14, 0x0

    if-eqz v13, :cond_0

    move-object/from16 v19, v14

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v19, v13

    :goto_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_1

    move-object/from16 v20, v14

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v20, v13

    :goto_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_2

    move-object/from16 v21, v14

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v21, v13

    :goto_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_3

    :goto_4
    move-object/from16 v22, v14

    goto :goto_5

    :cond_3
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v14

    goto :goto_4

    :goto_5
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    long-to-int v13, v13

    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v24

    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v26

    move/from16 p0, v2

    move/from16 v30, v3

    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    :goto_6
    move/from16 v28, v2

    goto :goto_7

    :cond_4
    const/4 v2, 0x0

    goto :goto_6

    :goto_7
    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v14, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move/from16 v29, v2

    move/from16 v23, v13

    invoke-direct/range {v14 .. v29}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJZI)V

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v2, p0

    move/from16 v3, v30

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_5
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v12

    :goto_8
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

.method public static synthetic iO(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)[J
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__insertAdapterOfRecordDeviceInfo:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnIdsArray(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public clearActiveStatus()I
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iX10X;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/iX10X;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public delete(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "deviceInfo"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiOXII;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/IiOXII;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public deleteAll()I
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XII1iO;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/XII1iO;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public deleteByMac(Ljava/lang/String;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "mac"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiiOO10;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/IiiOO10;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public getActiveDevice()Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOO1i11X;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/IOO1i11X;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    return-object v0
.end method

.method public getAllDevices()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X1iOI;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/X1iOI;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getDeviceByMac(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "mac"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiX0IO;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/OiX0IO;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    return-object p1
.end method

.method public getDeviceCount()I
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1I010i00;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/I1I010i00;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public hasDevices()Z
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiIO01O0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/XiIO01O0;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public insertOrUpdate(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)J
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "deviceInfo"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiXi100;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/IiXi100;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public insertOrUpdateList(Ljava/util/List;)[J
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "deviceInfos"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
            ">;)[J"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1IXiiX;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/i1IXiiX;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [J

    return-object p1
.end method

.method public setActiveDevice(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "mac"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1iX0;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/I1iX0;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public setDeviceActive(Ljava/lang/String;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "mac"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiXi0i1OX;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/IiXi0i1OX;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public update(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "deviceInfo"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OO1OI00XI;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/OO1OI00XI;-><init>(Lcom/sma/smartv3/db/dao/DeviceInfoDao_Impl;Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
