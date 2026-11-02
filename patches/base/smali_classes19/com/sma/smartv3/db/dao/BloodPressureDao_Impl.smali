.class public final Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/BloodPressureDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertAdapterOfBloodPressure:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfBloodPressure:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
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

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__insertAdapterOfBloodPressure:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl$2;-><init>(Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__updateAdapterOfBloodPressure:Landroidx/room/EntityDeleteOrUpdateAdapter;

    return-void
.end method

.method public static synthetic O00(JJLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 18

    const-string v0, "SELECT * FROM BloodPressure WHERE mTime >= ? AND mTime < ? AND mSystolic <200 AND mDiastolic >=60 "

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    const/4 v0, 0x1

    move-wide/from16 v2, p0

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindLong(IJ)V

    const/4 v0, 0x2

    move-wide/from16 v2, p2

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

    const-string v4, "mSystolic"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mDiastolic"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v11, v8

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v12

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x0

    :goto_1
    move-object v14, v8

    goto :goto_2

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :goto_2
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v15, v8

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    long-to-int v9, v9

    new-instance v10, Lcom/sma/smartv3/db/entity/BloodPressure;

    move/from16 v16, v8

    move/from16 v17, v9

    invoke-direct/range {v10 .. v17}, Lcom/sma/smartv3/db/entity/BloodPressure;-><init>(IJLjava/lang/String;III)V

    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v7

    :goto_3
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__updateAdapterOfBloodPressure:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handleMultiple(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Iterable;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)[J
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__insertAdapterOfBloodPressure:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnIdsArray(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[J

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 18

    const-string v0, "SELECT * FROM BloodPressure WHERE  mIsSync = 0 AND mTime > 0 AND mSystolic <200 AND mDiastolic >=60 ORDER BY mTime ASC LIMIT 150"

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

    const-string v4, "mSystolic"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mDiastolic"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v11, v8

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v12

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x0

    :goto_1
    move-object v14, v8

    goto :goto_2

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :goto_2
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v15, v8

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    long-to-int v9, v9

    new-instance v10, Lcom/sma/smartv3/db/entity/BloodPressure;

    move/from16 v16, v8

    move/from16 v17, v9

    invoke-direct/range {v10 .. v17}, Lcom/sma/smartv3/db/entity/BloodPressure;-><init>(IJLjava/lang/String;III)V

    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v7

    :goto_3
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

.method public static synthetic iO(Landroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/BloodPressure;
    .locals 19

    const-string v0, "SELECT * FROM BloodPressure WHERE mSystolic <200 AND mDiastolic >=60 ORDER BY mId DESC LIMIT 1"

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

    const-string v4, "mSystolic"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "mDiastolic"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "mIsSync"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v9

    long-to-int v12, v9

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v13

    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    move-object v15, v8

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :goto_1
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    new-instance v11, Lcom/sma/smartv3/db/entity/BloodPressure;

    move/from16 v16, v0

    move/from16 v17, v2

    move/from16 v18, v3

    invoke-direct/range {v11 .. v18}, Lcom/sma/smartv3/db/entity/BloodPressure;-><init>(IJLjava/lang/String;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, v11

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_2
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v8

    :goto_3
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method


# virtual methods
.method public getBloodPressures(JJ)Ljava/util/List;
    .locals 2
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
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiXiI1OXI;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/iiXiI1OXI;-><init>(JJ)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getLastBloodPressure()Lcom/sma/smartv3/db/entity/BloodPressure;
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiIOIXOO0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OiIOIXOO0;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodPressure;

    return-object v0
.end method

.method public getListASC()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/II1XiXO;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/II1XiXO;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getTestBloodPressures(JJ)Ljava/util/List;
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
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/BloodPressureDao$DefaultImpls;->getTestBloodPressures(Lcom/sma/smartv3/db/dao/BloodPressureDao;JJ)Ljava/util/List;

    move-result-object p1

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
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;)[J"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI1OOIX0;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/OI1OOIX0;-><init>(Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;Ljava/util/List;)V

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
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiiiXIiO;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/iiiiXIiO;-><init>(Lcom/sma/smartv3/db/dao/BloodPressureDao_Impl;Ljava/util/List;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
