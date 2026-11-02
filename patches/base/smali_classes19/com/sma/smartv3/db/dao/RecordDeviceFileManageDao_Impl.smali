.class public final Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deleteAdapterOfRecordDeviceManage:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfRecordDeviceManage:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfRecordDeviceManage:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
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

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__insertAdapterOfRecordDeviceManage:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl$2;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__deleteAdapterOfRecordDeviceManage:Landroidx/room/EntityDeleteOrUpdateAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl$3;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl$3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__updateAdapterOfRecordDeviceManage:Landroidx/room/EntityDeleteOrUpdateAdapter;

    return-void
.end method

.method public static synthetic I0IIOi(JLandroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM RecordDeviceManage WHERE mId = ?"

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

.method public static synthetic IiI10X(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)[J
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__insertAdapterOfRecordDeviceManage:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnIdsArray(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 14

    const-string v0, "SELECT * FROM RecordDeviceManage WHERE REPLACE(LOWER(mName), \'.aac\', \'\') LIKE \'%\' || LOWER(?) || \'%\' ORDER BY mTime DESC"

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto/16 :goto_6

    :cond_0
    invoke-interface {p1, v0, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    const-string p0, "mId"

    invoke-static {p1, p0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result p0

    const-string v0, "mTime"

    invoke-static {p1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v1, "mLocalTime"

    invoke-static {p1, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    const-string v2, "mFileName"

    invoke-static {p1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mName"

    invoke-static {p1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    move-object v11, v6

    goto :goto_2

    :cond_1
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    move-object v11, v5

    :goto_2
    invoke-interface {p1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v12, v6

    goto :goto_3

    :cond_2
    invoke-interface {p1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    move-object v12, v5

    :goto_3
    invoke-interface {p1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_4
    move-object v13, v6

    goto :goto_5

    :cond_3
    invoke-interface {p1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :goto_5
    new-instance v6, Lcom/sma/smartv3/db/entity/RecordDeviceManage;

    invoke-direct/range {v6 .. v13}, Lcom/sma/smartv3/db/entity/RecordDeviceManage;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v4

    :goto_6
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic OIi0(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 14

    const-string v0, "SELECT * FROM RecordDeviceManage WHERE mFileName == ? ORDER BY mTime DESC"

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto/16 :goto_6

    :cond_0
    invoke-interface {p1, v0, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    const-string p0, "mId"

    invoke-static {p1, p0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result p0

    const-string v0, "mTime"

    invoke-static {p1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v1, "mLocalTime"

    invoke-static {p1, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    const-string v2, "mFileName"

    invoke-static {p1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mName"

    invoke-static {p1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v7

    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    move-object v11, v6

    goto :goto_2

    :cond_1
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    move-object v11, v5

    :goto_2
    invoke-interface {p1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v12, v6

    goto :goto_3

    :cond_2
    invoke-interface {p1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    move-object v12, v5

    :goto_3
    invoke-interface {p1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_4
    move-object v13, v6

    goto :goto_5

    :cond_3
    invoke-interface {p1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :goto_5
    new-instance v6, Lcom/sma/smartv3/db/entity/RecordDeviceManage;

    invoke-direct/range {v6 .. v13}, Lcom/sma/smartv3/db/entity/RecordDeviceManage;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v4

    :goto_6
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__deleteAdapterOfRecordDeviceManage:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 15

    const-string v0, "SELECT * FROM RecordDeviceManage "

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p0

    :try_start_0
    const-string v0, "mId"

    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v1, "mTime"

    invoke-static {p0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    const-string v2, "mLocalTime"

    invoke-static {p0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "mFileName"

    invoke-static {p0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "mName"

    invoke-static {p0, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v10

    invoke-interface {p0, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    move-object v12, v7

    goto :goto_1

    :cond_0
    invoke-interface {p0, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    move-object v12, v6

    :goto_1
    invoke-interface {p0, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v13, v7

    goto :goto_2

    :cond_1
    invoke-interface {p0, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    move-object v13, v6

    :goto_2
    invoke-interface {p0, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2

    :goto_3
    move-object v14, v7

    goto :goto_4

    :cond_2
    invoke-interface {p0, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :goto_4
    new-instance v7, Lcom/sma/smartv3/db/entity/RecordDeviceManage;

    invoke-direct/range {v7 .. v14}, Lcom/sma/smartv3/db/entity/RecordDeviceManage;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_3
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v5

    :goto_5
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic XO0O10(Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM RecordDeviceManage"

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

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__updateAdapterOfRecordDeviceManage:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

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

.method public static synthetic iO(JLandroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/RecordDeviceManage;
    .locals 13

    const-string v0, "SELECT * FROM RecordDeviceManage WHERE mId = ?"

    invoke-interface {p2, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p2, v0, p0, p1}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const-string p0, "mId"

    invoke-static {p2, p0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result p0

    const-string p1, "mTime"

    invoke-static {p2, p1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result p1

    const-string v0, "mLocalTime"

    invoke-static {p2, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v1, "mFileName"

    invoke-static {p2, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    const-string v2, "mName"

    invoke-static {p2, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    invoke-interface {p2}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {p2, p0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    invoke-interface {p2, p1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    invoke-interface {p2, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result p0

    if-eqz p0, :cond_0

    move-object v10, v4

    goto :goto_0

    :cond_0
    invoke-interface {p2, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object p0

    move-object v10, p0

    :goto_0
    invoke-interface {p2, v1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result p0

    if-eqz p0, :cond_1

    move-object v11, v4

    goto :goto_1

    :cond_1
    invoke-interface {p2, v1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object p0

    move-object v11, p0

    :goto_1
    invoke-interface {p2, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_2
    move-object v12, v4

    goto :goto_3

    :cond_2
    invoke-interface {p2, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :goto_3
    new-instance v5, Lcom/sma/smartv3/db/entity/RecordDeviceManage;

    invoke-direct/range {v5 .. v12}, Lcom/sma/smartv3/db/entity/RecordDeviceManage;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v5

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_5

    :cond_3
    :goto_4
    invoke-interface {p2}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v4

    :goto_5
    invoke-interface {p2}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
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
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vc3;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/vc3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public deleteAll()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oc3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/oc3;-><init>()V

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

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sc3;

    invoke-direct {v1, p1, p2}, Lcom/android/mltcode/paycertificationapi/sc3;-><init>(J)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public getDeviceFiletById(J)Lcom/sma/smartv3/db/entity/RecordDeviceManage;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "id"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/rc3;

    invoke-direct {v1, p1, p2}, Lcom/android/mltcode/paycertificationapi/rc3;-><init>(J)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/RecordDeviceManage;

    return-object p1
.end method

.method public getListAll()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pc3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/pc3;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getListByType(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "fileName"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tc3;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/tc3;-><init>(Ljava/lang/String;)V

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
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;)[J"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qc3;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/qc3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;Ljava/util/List;)V

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
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uc3;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/uc3;-><init>(Ljava/lang/String;)V

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
            "Lcom/sma/smartv3/db/entity/RecordDeviceManage;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nc3;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/nc3;-><init>(Lcom/sma/smartv3/db/dao/RecordDeviceFileManageDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
