.class public interface abstract Lcom/sma/smartv3/db/dao/BloodOxygenDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract getBloodOxygen(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM BloodOxygen WHERE mTime >= :start AND mTime < :end AND mValue >= 10 AND mValue<= 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLastBloodOxygen()Lcom/sma/smartv3/db/entity/BloodOxygen;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM BloodOxygen WHERE mTime > 0 AND mValue >= 10 AND mValue<= 150 ORDER BY mId DESC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getListASC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM BloodOxygen WHERE  mIsSync = 0  AND mTime > 0 AND mValue >= 10 AND mValue<= 150 ORDER BY mTime ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
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
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
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
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
            ">;)I"
        }
    .end annotation
.end method
