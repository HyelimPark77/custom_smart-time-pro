.class public interface abstract Lcom/sma/smartv3/db/dao/HealthyReportDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract getHealthyReport(J)Lcom/sma/smartv3/db/entity/HealthyReport;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM healthyReport WHERE  mId = :id"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract getListASC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM healthyReport WHERE  mTime > 0  ORDER BY mTime ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/HealthyReport;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/sma/smartv3/db/entity/HealthyReport;)J
    .param p1    # Lcom/sma/smartv3/db/entity/HealthyReport;
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
            "Lcom/sma/smartv3/db/entity/HealthyReport;",
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
            "Lcom/sma/smartv3/db/entity/HealthyReport;",
            ">;)I"
        }
    .end annotation
.end method
