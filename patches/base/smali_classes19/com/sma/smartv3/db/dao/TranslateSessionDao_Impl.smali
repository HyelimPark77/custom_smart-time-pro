.class public final Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/db/dao/TranslateSessionDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __deleteAdapterOfTranslateSessionEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfTranslateSessionEntity:Landroidx/room/EntityInsertAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertAdapter<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final __updateAdapterOfTranslateSessionEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityDeleteOrUpdateAdapter<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
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

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance p1, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$1;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__insertAdapterOfTranslateSessionEntity:Landroidx/room/EntityInsertAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$2;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__deleteAdapterOfTranslateSessionEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    new-instance p1, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$3;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl$3;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__updateAdapterOfTranslateSessionEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    return-void
.end method

.method public static synthetic I0IIOi(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 41

    const-string v0, "\n    SELECT \n        parent.*,\n        child.sessionId AS child_sessionId,\n        child.requestId AS child_requestId,\n        child.text AS child_text,\n        child.translate AS child_translate,\n        child.duration AS child_duration,\n        child.createTime AS child_createTime,\n        child.audioPath AS child_audioPath,\n        child.fromLanguage AS child_fromLanguage,\n        child.toLanguage AS child_toLanguage,\n        child.isUpLoaded AS child_isUpLoaded,\n        child.showType as child_showType\n        \n    FROM TranslateSessionEntity AS parent\n    LEFT JOIN TranslateEntity AS child\n        ON child.requestId = (\n            SELECT requestId\n            FROM TranslateEntity\n            WHERE sessionId = parent.sessionId\n            ORDER BY createTime ASC\n            LIMIT 1\n        )\n     WHERE parent.isDelete = 0\n     ORDER BY parent.createTime DESC\n     "

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v1

    :try_start_0
    const-string v0, "sessionId"

    invoke-static {v1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v2, "audioPath"

    invoke-static {v1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "duration"

    invoke-static {v1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "createTime"

    invoke-static {v1, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "isDelete"

    invoke-static {v1, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "child_sessionId"

    invoke-static {v1, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    const-string v7, "child_requestId"

    invoke-static {v1, v7}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v7

    const-string v8, "child_text"

    invoke-static {v1, v8}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v8

    const-string v9, "child_translate"

    invoke-static {v1, v9}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v9

    const-string v10, "child_duration"

    invoke-static {v1, v10}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v10

    const-string v11, "child_createTime"

    invoke-static {v1, v11}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v11

    const-string v12, "child_audioPath"

    invoke-static {v1, v12}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v12

    const-string v13, "child_fromLanguage"

    invoke-static {v1, v13}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v13

    const-string v14, "child_toLanguage"

    invoke-static {v1, v14}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v14

    const-string v15, "child_isUpLoaded"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "child_showType"

    invoke-static {v1, v15}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v17

    if-eqz v17, :cond_a

    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v17

    const/16 v18, 0x0

    if-eqz v17, :cond_0

    move-object/from16 v20, v18

    goto :goto_1

    :cond_0
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v20, v17

    :goto_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_1

    move-object/from16 v21, v18

    move/from16 v17, v14

    move-object/from16 v26, v15

    goto :goto_2

    :cond_1
    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v21, v17

    move-object/from16 v26, v15

    move/from16 v17, v14

    :goto_2
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v14

    double-to-float v14, v14

    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v23

    move v15, v2

    move/from16 v27, v3

    invoke-interface {v1, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v19, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move/from16 v25, v2

    move/from16 v22, v14

    invoke-direct/range {v19 .. v25}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJI)V

    move-object/from16 v2, v19

    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v32, v18

    goto :goto_3

    :cond_2
    invoke-interface {v1, v6}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v32, v3

    :goto_3
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object/from16 v29, v18

    goto :goto_4

    :cond_3
    invoke-interface {v1, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v29, v3

    :goto_4
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object/from16 v30, v18

    goto :goto_5

    :cond_4
    invoke-interface {v1, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v30, v3

    :goto_5
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object/from16 v31, v18

    :goto_6
    move v14, v4

    goto :goto_7

    :cond_5
    invoke-interface {v1, v9}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v31, v3

    goto :goto_6

    :goto_7
    invoke-interface {v1, v10}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v3

    double-to-float v3, v3

    invoke-interface {v1, v11}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v38

    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object/from16 v35, v18

    goto :goto_8

    :cond_6
    invoke-interface {v1, v12}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v35, v4

    :goto_8
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v36, v18

    :goto_9
    move/from16 v4, v17

    goto :goto_a

    :cond_7
    invoke-interface {v1, v13}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v36, v4

    goto :goto_9

    :goto_a
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_8

    :goto_b
    move/from16 v17, v0

    move/from16 v0, p0

    move/from16 p0, v17

    move/from16 v33, v3

    move/from16 v17, v4

    move-object/from16 v37, v18

    goto :goto_c

    :cond_8
    invoke-interface {v1, v4}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v18

    goto :goto_b

    :goto_c
    invoke-interface {v1, v0}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_9

    const/4 v3, 0x1

    :goto_d
    move/from16 v34, v3

    move/from16 v3, v16

    move/from16 v16, v5

    goto :goto_e

    :cond_9
    const/4 v3, 0x0

    goto :goto_d

    :goto_e
    invoke-interface {v1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    new-instance v28, Lcom/sma/smartv3/db/entity/TranslateEntity;

    move/from16 v40, v4

    invoke-direct/range {v28 .. v40}, Lcom/sma/smartv3/db/entity/TranslateEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    move-object/from16 v4, v28

    new-instance v5, Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;

    invoke-direct {v5, v2, v4}, Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;-><init>(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;Lcom/sma/smartv3/db/entity/TranslateEntity;)V

    move-object/from16 v2, v26

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v4, v0

    move/from16 v0, p0

    move/from16 p0, v4

    move v4, v15

    move-object v15, v2

    move v2, v4

    move v4, v14

    move/from16 v5, v16

    move/from16 v14, v17

    move/from16 v16, v3

    move/from16 v3, v27

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_f

    :cond_a
    move-object v2, v15

    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v2

    :goto_f
    invoke-interface {v1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__insertAdapterOfTranslateSessionEntity:Landroidx/room/EntityInsertAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityInsertAdapter;->insertAndReturnId(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__updateAdapterOfTranslateSessionEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Landroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 14

    const-string v0, "select * from translatesessionentity ORDER BY createTime DESC limit 1"

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p0

    :try_start_0
    const-string v0, "sessionId"

    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v1, "audioPath"

    invoke-static {p0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    const-string v2, "duration"

    invoke-static {p0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "createTime"

    invoke-static {p0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "isDelete"

    invoke-static {p0, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v8, v6

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    :goto_0
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    move-object v9, v6

    goto :goto_2

    :cond_1
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :goto_2
    invoke-interface {p0, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v0

    double-to-float v10, v0

    invoke-interface {p0, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v11

    invoke-interface {p0, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v13, v0

    new-instance v7, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    invoke-direct/range {v7 .. v13}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v7

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_3
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v6

    :goto_4
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method public static synthetic OXO1(Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 13

    const-string v0, "select * from  translatesessionentity where sessionId = ?"

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

    goto :goto_4

    :cond_0
    invoke-interface {p1, v0, p0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    const-string p0, "sessionId"

    invoke-static {p1, p0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result p0

    const-string v0, "audioPath"

    invoke-static {p1, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v1, "duration"

    invoke-static {p1, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    const-string v2, "createTime"

    invoke-static {p1, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "isDelete"

    invoke-static {p1, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v7, v5

    goto :goto_1

    :cond_1
    invoke-interface {p1, p0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object p0

    move-object v7, p0

    :goto_1
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_2
    move-object v8, v5

    goto :goto_3

    :cond_2
    invoke-interface {p1, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :goto_3
    invoke-interface {p1, v1}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v0

    double-to-float v9, v0

    invoke-interface {p1, v2}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v10

    invoke-interface {p1, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v0

    long-to-int v12, v0

    new-instance v6, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    invoke-direct/range {v6 .. v12}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v6

    :cond_3
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v5

    :goto_4
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__deleteAdapterOfTranslateSessionEntity:Landroidx/room/EntityDeleteOrUpdateAdapter;

    invoke-virtual {p0, p2, p1}, Landroidx/room/EntityDeleteOrUpdateAdapter;->handle(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Landroidx/sqlite/SQLiteConnection;Landroidx/collection/ArrayMap;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__fetchRelationshipTranslateEntityAscomSmaSmartv3DbEntityTranslateEntity(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/ArrayMap;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic XOO0ii0(Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;
    .locals 15

    const-string v0, "select * from translatesessionentity"

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object p0

    :try_start_0
    const-string v0, "sessionId"

    invoke-static {p0, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v1, "audioPath"

    invoke-static {p0, v1}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v1

    const-string v2, "duration"

    invoke-static {p0, v2}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v2

    const-string v3, "createTime"

    invoke-static {p0, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "isDelete"

    invoke-static {p0, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    move-object v9, v7

    goto :goto_1

    :cond_0
    invoke-interface {p0, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    move-object v9, v6

    :goto_1
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1

    :goto_2
    move-object v10, v7

    goto :goto_3

    :cond_1
    invoke-interface {p0, v1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :goto_3
    invoke-interface {p0, v2}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v6

    double-to-float v11, v6

    invoke-interface {p0, v3}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v12

    invoke-interface {p0, v4}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v14, v6

    new-instance v8, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    invoke-direct/range {v8 .. v14}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJI)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_2
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v5

    :goto_4
    invoke-interface {p0}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method private __fetchRelationshipTranslateEntityAscomSmaSmartv3DbEntityTranslateEntity(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/ArrayMap;)V
    .locals 22
    .param p1    # Landroidx/sqlite/SQLiteConnection;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/collection/ArrayMap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "_connection",
            "_map"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/sqlite/SQLiteConnection;",
            "Landroidx/collection/ArrayMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;>;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v1}, Landroidx/collection/ArrayMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Landroidx/collection/SimpleArrayMap;->size()I

    move-result v3

    const/16 v4, 0x3e7

    const/4 v5, 0x1

    if-le v3, v4, :cond_1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/t06;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v0}, Lcom/android/mltcode/paycertificationapi/t06;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Landroidx/sqlite/SQLiteConnection;)V

    invoke-static {v1, v5, v2}, Landroidx/room/util/RelationUtil;->recursiveFetchArrayMap(Landroidx/collection/ArrayMap;ZLkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    move-object/from16 v3, p0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT `requestId`,`text`,`translate`,`sessionId`,`duration`,`isUpLoaded`,`audioPath`,`fromLanguage`,`toLanguage`,`createTime`,`showType` FROM `TranslateEntity` WHERE `sessionId` IN ("

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v6

    invoke-static {v4, v6}, Landroidx/room/util/StringUtil;->appendPlaceholders(Ljava/lang/StringBuilder;I)V

    const-string v6, ")"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v5

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_2

    invoke-interface {v4, v2}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_1

    :cond_2
    invoke-interface {v4, v2, v6}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :try_start_0
    const-string v0, "sessionId"

    invoke-static {v4, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndex(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_4

    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-void

    :cond_4
    :goto_2
    :try_start_1
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v4, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v2

    const/4 v6, 0x0

    if-eqz v2, :cond_5

    move-object v2, v6

    goto :goto_3

    :cond_5
    invoke-interface {v4, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v2

    :goto_3
    if-eqz v2, :cond_4

    invoke-virtual {v1, v2}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    if-eqz v2, :cond_4

    const/4 v7, 0x0

    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_6

    move-object v10, v6

    goto :goto_4

    :cond_6
    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    move-object v10, v8

    :goto_4
    invoke-interface {v4, v5}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_7

    move-object v11, v6

    goto :goto_5

    :cond_7
    invoke-interface {v4, v5}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    move-object v11, v8

    :goto_5
    const/4 v8, 0x2

    invoke-interface {v4, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_8

    move-object v12, v6

    goto :goto_6

    :cond_8
    invoke-interface {v4, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    move-object v12, v8

    :goto_6
    const/4 v8, 0x3

    invoke-interface {v4, v8}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_9

    move-object v13, v6

    goto :goto_7

    :cond_9
    invoke-interface {v4, v8}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v8

    move-object v13, v8

    :goto_7
    const/4 v8, 0x4

    invoke-interface {v4, v8}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v8

    double-to-float v14, v8

    const/4 v8, 0x5

    invoke-interface {v4, v8}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v8

    long-to-int v8, v8

    if-eqz v8, :cond_a

    move v15, v5

    goto :goto_8

    :cond_a
    move v15, v7

    :goto_8
    const/4 v7, 0x6

    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_b

    move-object/from16 v16, v6

    goto :goto_9

    :cond_b
    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v16, v7

    :goto_9
    const/4 v7, 0x7

    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_c

    move-object/from16 v17, v6

    goto :goto_a

    :cond_c
    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v17, v7

    :goto_a
    const/16 v7, 0x8

    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_d

    :goto_b
    move-object/from16 v18, v6

    goto :goto_c

    :cond_d
    invoke-interface {v4, v7}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_b

    :goto_c
    const/16 v6, 0x9

    invoke-interface {v4, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v19

    const/16 v6, 0xa

    invoke-interface {v4, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    new-instance v9, Lcom/sma/smartv3/db/entity/TranslateEntity;

    move/from16 v21, v6

    invoke-direct/range {v9 .. v21}, Lcom/sma/smartv3/db/entity/TranslateEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto :goto_d

    :cond_e
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-void

    :goto_d
    invoke-interface {v4}, Landroidx/sqlite/SQLiteStatement;->close()V

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

.method public static synthetic iO(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "select * from  translatesessionentity where sessionId = ?"

    invoke-interface {v1, v2}, Landroidx/sqlite/SQLiteConnection;->prepare(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;

    move-result-object v2

    const/4 v3, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v2, v3}, Landroidx/sqlite/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    invoke-interface {v2, v3, v0}, Landroidx/sqlite/SQLiteStatement;->bindText(ILjava/lang/String;)V

    :goto_0
    const-string v0, "sessionId"

    invoke-static {v2, v0}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v0

    const-string v3, "audioPath"

    invoke-static {v2, v3}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v3

    const-string v4, "duration"

    invoke-static {v2, v4}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v4

    const-string v5, "createTime"

    invoke-static {v2, v5}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v5

    const-string v6, "isDelete"

    invoke-static {v2, v6}, Landroidx/room/util/SQLiteStatementUtil;->getColumnIndexOrThrow(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Landroidx/collection/ArrayMap;

    invoke-direct {v7}, Landroidx/collection/ArrayMap;-><init>()V

    :cond_1
    :goto_1
    invoke-interface {v2}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_3

    invoke-interface {v2, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v2, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v9

    :goto_2
    if-eqz v9, :cond_1

    invoke-virtual {v7, v9}, Landroidx/collection/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7, v9, v8}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-interface {v2}, Landroidx/sqlite/SQLiteStatement;->reset()V

    move-object/from16 v8, p0

    invoke-direct {v8, v1, v7}, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__fetchRelationshipTranslateEntityAscomSmaSmartv3DbEntityTranslateEntity(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/ArrayMap;)V

    invoke-interface {v2}, Landroidx/sqlite/SQLiteStatement;->step()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v2, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v11, v9

    goto :goto_3

    :cond_4
    invoke-interface {v2, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v1

    move-object v11, v1

    :goto_3
    invoke-interface {v2, v3}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_5

    move-object v12, v9

    goto :goto_4

    :cond_5
    invoke-interface {v2, v3}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    :goto_4
    invoke-interface {v2, v4}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    move-result-wide v3

    double-to-float v13, v3

    invoke-interface {v2, v5}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v14

    invoke-interface {v2, v6}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    move-result-wide v3

    long-to-int v1, v3

    new-instance v10, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move/from16 v16, v1

    invoke-direct/range {v10 .. v16}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJI)V

    invoke-interface {v2, v0}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v2, v0}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    move-result-object v9

    :goto_5
    if-eqz v9, :cond_7

    invoke-virtual {v7, v9}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    goto :goto_6

    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_6
    new-instance v9, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;

    invoke-direct {v9, v10, v0}, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;-><init>(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    invoke-interface {v2}, Landroidx/sqlite/SQLiteStatement;->close()V

    return-object v9

    :goto_7
    invoke-interface {v2}, Landroidx/sqlite/SQLiteStatement;->close()V

    throw v0
.end method


# virtual methods
.method public delete(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "sessionEntity"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/o06;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/o06;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public getAllSessionsWithFirstEntity()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r06;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/r06;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getAllTranslationList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/p06;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/p06;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getTranslateFirst()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/u06;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/u06;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    return-object v0
.end method

.method public insert(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)J
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "translateSessionEntity"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/v06;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/v06;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public queryBySessionId(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "sessionId"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/w06;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/w06;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;

    return-object p1
.end method

.method public querySessionById(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "sessionId"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/q06;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/q06;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    return-object p1
.end method

.method public update(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "sessionEntity"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/s06;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/s06;-><init>(Lcom/sma/smartv3/db/dao/TranslateSessionDao_Impl;Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Landroidx/room/util/DBUtil;->performBlocking(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
