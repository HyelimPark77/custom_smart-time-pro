.class public interface abstract Lcom/sma/smartv3/db/dao/TranslateDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract delete(Lcom/sma/smartv3/db/entity/TranslateEntity;)V
    .param p1    # Lcom/sma/smartv3/db/entity/TranslateEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Delete;
    .end annotation
.end method

.method public abstract getFirstTranslatePerSession()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "\n        SELECT t.*\n        FROM TranslateEntity t\n        INNER JOIN (\n            SELECT sessionId, MIN(createTime) AS firstTime\n            FROM TranslateEntity\n            GROUP BY sessionId\n        ) grouped ON t.sessionId = grouped.sessionId AND t.createTime = grouped.firstTime\n        ORDER BY t.createTime ASC\n    "
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTranslateEntityWithSessionId(Ljava/lang/String;)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "SELECT * from TranslateEntity where sessionId=:sessionId"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/sma/smartv3/db/entity/TranslateEntity;)J
    .param p1    # Lcom/sma/smartv3/db/entity/TranslateEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public abstract insertAll(Ljava/util/List;)Ljava/util/List;
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x5
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end method

.method public abstract update(Lcom/sma/smartv3/db/entity/TranslateEntity;)V
    .param p1    # Lcom/sma/smartv3/db/entity/TranslateEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method
