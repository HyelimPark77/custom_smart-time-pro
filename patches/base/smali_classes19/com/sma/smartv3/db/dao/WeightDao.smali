.class public interface abstract Lcom/sma/smartv3/db/dao/WeightDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/dao/WeightDao$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeightDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightDao.kt\ncom/sma/smartv3/db/dao/WeightDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1869#2,2:53\n*S KotlinDebug\n*F\n+ 1 WeightDao.kt\ncom/sma/smartv3/db/dao/WeightDao\n*L\n43#1:53,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeightDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightDao.kt\ncom/sma/smartv3/db/dao/WeightDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1869#2,2:53\n*S KotlinDebug\n*F\n+ 1 WeightDao.kt\ncom/sma/smartv3/db/dao/WeightDao\n*L\n43#1:53,2\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic access$getTestWeights$jd(Lcom/sma/smartv3/db/dao/WeightDao;JJ)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/WeightDao;->getTestWeights(JJ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract delete(J)V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM Weight WHERE mTime = :mTime"
    .end annotation
.end method

.method public abstract getListASC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Weight WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation
.end method

.method public getTestWeights(JJ)Ljava/util/List;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation

    sget-object p3, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p3}, Lcom/sma/smartv3/db/dao/TestData;->getTestWeights()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    :try_start_0
    new-instance p3, Lcom/google/gson/Gson;

    invoke-direct {p3}, Lcom/google/gson/Gson;-><init>()V

    const-string p4, "weight"

    invoke-static {p4}, Lcom/blankj/utilcode/util/ResourceUtils;->readAssets2String(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    new-instance v0, Lcom/sma/smartv3/db/dao/WeightDao$getTestWeights$list$1;

    invoke-direct {v0}, Lcom/sma/smartv3/db/dao/WeightDao$getTestWeights$list$1;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p3, p4, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p3

    const-string p4, "fromJson(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/util/List;

    move-object p4, p3

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Weight;

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/db/entity/Weight;->setMTime(J)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    add-long/2addr p1, v0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/dao/TestData;->getTestWeights()Ljava/util/List;

    move-result-object p1

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p1, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    sget-object p1, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/dao/TestData;->getTestWeights()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public abstract getWeights()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Weight WHERE mIsDelete != 1 ORDER BY mTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getWeightsASC(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Weight WHERE mTime >= :start AND mTime < :end AND mIsDelete != 1 ORDER BY mTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getWeightsDESC(II)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Weight WHERE  mIsDelete != 1 ORDER BY mTime DESC LIMIT :startIndex, :endIndex"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
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
            "Lcom/sma/smartv3/db/entity/Weight;",
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
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;)I"
        }
    .end annotation
.end method
