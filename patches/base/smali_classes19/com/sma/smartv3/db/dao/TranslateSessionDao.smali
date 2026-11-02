.class public interface abstract Lcom/sma/smartv3/db/dao/TranslateSessionDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract delete(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V
    .param p1    # Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Delete;
    .end annotation
.end method

.method public abstract getAllSessionsWithFirstEntity()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "\n    SELECT \n        parent.*,\n        child.sessionId AS child_sessionId,\n        child.requestId AS child_requestId,\n        child.text AS child_text,\n        child.translate AS child_translate,\n        child.duration AS child_duration,\n        child.createTime AS child_createTime,\n        child.audioPath AS child_audioPath,\n        child.fromLanguage AS child_fromLanguage,\n        child.toLanguage AS child_toLanguage,\n        child.isUpLoaded AS child_isUpLoaded,\n        child.showType as child_showType\n        \n    FROM TranslateSessionEntity AS parent\n    LEFT JOIN TranslateEntity AS child\n        ON child.requestId = (\n            SELECT requestId\n            FROM TranslateEntity\n            WHERE sessionId = parent.sessionId\n            ORDER BY createTime ASC\n            LIMIT 1\n        )\n     WHERE parent.isDelete = 0\n     ORDER BY parent.createTime DESC\n     "
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAllTranslationList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "select * from translatesessionentity"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTranslateFirst()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .annotation build Landroidx/room/Query;
        value = "select * from translatesessionentity ORDER BY createTime DESC limit 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract insert(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)J
    .param p1    # Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x3
    .end annotation
.end method

.method public abstract queryBySessionId(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "select * from  translatesessionentity where sessionId = :sessionId"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract querySessionById(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "select * from  translatesessionentity where sessionId = :sessionId"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract update(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)I
    .param p1    # Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method
