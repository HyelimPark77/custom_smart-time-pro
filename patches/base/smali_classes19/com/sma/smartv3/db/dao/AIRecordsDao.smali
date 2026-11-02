.class public interface abstract Lcom/sma/smartv3/db/dao/AIRecordsDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract getAIRecord(J)Lcom/sma/smartv3/db/entity/AIRecords;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM airecords WHERE  mId = :id"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract getListASC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM airecords WHERE  mIsSync = 0  ORDER BY mTime ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListASC(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM airecords WHERE mAIFuncType = :type AND mIsDelete !=1  ORDER BY mTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListDESC(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM airecords WHERE mAIFuncType = :type AND mIsDelete !=1 ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/sma/smartv3/db/entity/AIRecords;)J
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
    .end annotation
.end method

.method public abstract insert(Ljava/util/List;)[J
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;)[J"
        }
    .end annotation
.end method

.method public abstract update(Lcom/sma/smartv3/db/entity/AIRecords;)I
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method

.method public abstract update(Ljava/util/List;)I
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/AIRecords;",
            ">;)I"
        }
    .end annotation
.end method
