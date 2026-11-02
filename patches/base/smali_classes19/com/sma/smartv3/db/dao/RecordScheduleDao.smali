.class public interface abstract Lcom/sma/smartv3/db/dao/RecordScheduleDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract delete(Lcom/sma/smartv3/db/entity/RecordSchedule;)I
    .param p1    # Lcom/sma/smartv3/db/entity/RecordSchedule;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Delete;
    .end annotation
.end method

.method public abstract deleteUnoperatedByDeviceFileId(JI)I
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM RecordSchedule WHERE mDeviceFileId = :deviceFileId AND mStatus != :keepStatus"
    .end annotation
.end method

.method public abstract getAllSchedules()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule ORDER BY mRemindTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordSchedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCompletedSchedules()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule WHERE mStatus = 2 ORDER BY mLastRemindTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordSchedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getExpiredSchedules()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule WHERE mStatus = 1 ORDER BY mLastRemindTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordSchedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPlannedSchedules()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule WHERE mStatus = 0 ORDER BY mIsRemindEnabled DESC, mLastRemindTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordSchedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getScheduleById(J)Lcom/sma/smartv3/db/entity/RecordSchedule;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule WHERE mId = :id"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getSchedulesByDeviceFileId(J)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule WHERE mDeviceFileId = :deviceFileId"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordSchedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSchedulesByStatus(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule WHERE mStatus = :status ORDER BY mRemindTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordSchedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTodySchedules()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordSchedule WHERE mStatus = 0 AND mIsRemindEnabled = 1 AND date(mLastRemindTime / 1000, \'unixepoch\') = date(\'now\') ORDER BY mLastRemindTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordSchedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/sma/smartv3/db/entity/RecordSchedule;)J
    .param p1    # Lcom/sma/smartv3/db/entity/RecordSchedule;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public abstract update(Lcom/sma/smartv3/db/entity/RecordSchedule;)I
    .param p1    # Lcom/sma/smartv3/db/entity/RecordSchedule;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method
