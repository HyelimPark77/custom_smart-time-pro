.class public interface abstract Lcom/sma/smartv3/db/dao/ScheduleDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract delete(Lcom/sma/smartv3/db/entity/Schedule;)I
    .param p1    # Lcom/sma/smartv3/db/entity/Schedule;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Delete;
    .end annotation
.end method

.method public abstract get(I)Lcom/sma/smartv3/db/entity/Schedule;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM schedule WHERE mId=:id"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getAll()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM schedule"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Schedule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/sma/smartv3/db/entity/Schedule;)J
    .param p1    # Lcom/sma/smartv3/db/entity/Schedule;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
    .end annotation
.end method

.method public varargs abstract update([Lcom/sma/smartv3/db/entity/Schedule;)I
    .param p1    # [Lcom/sma/smartv3/db/entity/Schedule;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method
