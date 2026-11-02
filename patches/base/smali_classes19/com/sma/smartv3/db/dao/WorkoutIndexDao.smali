.class public interface abstract Lcom/sma/smartv3/db/dao/WorkoutIndexDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract getNotSynced()Lcom/sma/smartv3/db/entity/WorkoutIndex;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM WorkoutIndex WHERE mSyncStatus != 1 LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract insert(Lcom/sma/smartv3/db/entity/WorkoutIndex;)J
    .param p1    # Lcom/sma/smartv3/db/entity/WorkoutIndex;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x5
    .end annotation
.end method

.method public abstract update(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V
    .param p1    # Lcom/sma/smartv3/db/entity/WorkoutIndex;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method
