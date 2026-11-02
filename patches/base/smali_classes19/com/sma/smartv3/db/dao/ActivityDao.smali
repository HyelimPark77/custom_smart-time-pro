.class public interface abstract Lcom/sma/smartv3/db/dao/ActivityDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract getActivity(JJ)Lcom/sma/smartv3/db/entity/Activity;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM activity WHERE mTime >= :start AND mTime < :end AND mStep >= 0 AND mCalorie > 0 AND mStep < 1000000 ORDER BY mTime DESC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getBeginItem(JJI)Lcom/sma/smartv3/db/entity/Activity;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM activity WHERE mTime >= :start AND mTime < :end AND mMode = :mode AND mState = 0 ORDER BY mTime DESC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getEndItem(JI)Lcom/sma/smartv3/db/entity/Activity;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM activity WHERE mTime = :end AND mMode = :mode AND mState = 4"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getLastSyncItem()Lcom/sma/smartv3/db/entity/Activity;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Activity WHERE  mIsSync = 1 AND mTime > 0  ORDER BY mTime DESC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getListASC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Activity WHERE  mIsSync = 0 AND mTime > 0  ORDER BY mTime ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListASC(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM activity WHERE mTime >= :start AND mTime < :end AND mCalorie >= 0 AND mStep <1000000 AND mDistance > 0 ORDER BY mTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListDESC(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM activity WHERE mTime >= :start AND mTime <= :end  AND mMode >= 7 AND mIsDelete !=1 ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNextItemByID(I)Lcom/sma/smartv3/db/entity/Activity;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Activity WHERE  mId > :id AND mTime > 0  ORDER BY mId ASC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getPreviousItemByID(I)Lcom/sma/smartv3/db/entity/Activity;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Activity WHERE  mId < :id AND mTime > 0  ORDER BY mId DESC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getStateActivityList(III)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Activity WHERE mState = :state AND mMode >= 7 AND mIsDelete !=1 ORDER BY mTime DESC LIMIT :startIndex, :endIndex"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getWorkoutListDESC(JJI)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM activity WHERE mTime >= :start AND mTime <= :end AND mMode = :mode ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
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
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)[J"
        }
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
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)I"
        }
    .end annotation
.end method
