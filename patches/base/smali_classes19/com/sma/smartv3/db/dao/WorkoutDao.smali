.class public interface abstract Lcom/sma/smartv3/db/dao/WorkoutDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/dao/WorkoutDao$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic getListDESC$default(Lcom/sma/smartv3/db/dao/WorkoutDao;IIIILjava/lang/Object;)Ljava/util/List;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListDESC(III)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getListDESC"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic getListDESC$default(Lcom/sma/smartv3/db/dao/WorkoutDao;JJIILjava/lang/Object;)Ljava/util/List;
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    .line 2
    invoke-interface/range {v0 .. v5}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListDESC(JJI)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getListDESC"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic getListModeDESC$default(Lcom/sma/smartv3/db/dao/WorkoutDao;JJIILjava/lang/Object;)Ljava/util/List;
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListModeDESC(JJI)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getListModeDESC"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic getNavigatorListModeDESC$default(Lcom/sma/smartv3/db/dao/WorkoutDao;JJIILjava/lang/Object;)Ljava/util/List;
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getNavigatorListModeDESC(JJI)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getNavigatorListModeDESC"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract getDescList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart DESC LIMIT 50"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFitnessWorkout(JI)Lcom/sma/smartv3/db/entity/Workout;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mEnd = :endTime AND mMode = :mode LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE  mStart > 0 ORDER BY mStart ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListASC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE  mIsSync = 0 AND mStart > 0 ORDER BY mStart ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListByMode(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1  AND mDuration > 0 ORDER BY mStart DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListByMode(II)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1 AND mSource = :source"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListDESC(III)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mStart > 0 AND mMode != 0 AND mMode != :filterMode AND mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListDESC(JJI)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mMode != :filterMode AND mIsDelete !=1 ORDER BY mStart DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListDESCByMode(III)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mStart > 0 AND mMode = :mode AND mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListModeDESC(JJI)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mMode == :filterMode AND mIsDelete !=1 ORDER BY mStart DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNavigatorListByMode(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mMode = :mode AND mIsDelete != 1   AND mChildNumber != -1 AND mDuration > 0 AND mNavigatorActualDistance > 0 ORDER BY mStart DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNavigatorListModeDESC(JJI)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mStart >= :startTime AND mEnd <= :endTime  AND mChildNumber != -1  AND mMode == :filterMode  AND mNavigatorActualDistance > 0 AND mDuration > 0 AND mIsDelete !=1 ORDER BY mStart DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getWorkout(JJ)Lcom/sma/smartv3/db/entity/Workout;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mStart = :startTime AND mEnd = :endTime"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract getWorkoutById(I)Lcom/sma/smartv3/db/entity/Workout;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Workout WHERE mId = :id"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract insert(Ljava/util/List;)[J
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;)[J"
        }
    .end annotation
.end method

.method public abstract update(Lcom/sma/smartv3/db/entity/Workout;)I
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
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
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;)I"
        }
    .end annotation
.end method
