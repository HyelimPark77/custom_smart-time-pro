.class public interface abstract Lcom/sma/smartv3/db/dao/DailyPowerDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract getDailyPower(JJ)Lcom/sma/smartv3/db/entity/DailyPower;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM DailyPower WHERE mTime >= :start AND mTime < :end AND mValue >= 0 AND mValue<= 100 ORDER BY mTime DESC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
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
            "Lcom/sma/smartv3/db/entity/DailyPower;",
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
            "Lcom/sma/smartv3/db/entity/DailyPower;",
            ">;)I"
        }
    .end annotation
.end method
