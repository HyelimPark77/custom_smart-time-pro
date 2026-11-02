.class public interface abstract Lcom/sma/smartv3/db/dao/SleepDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/dao/SleepDao$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSleepDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDao.kt\ncom/sma/smartv3/db/dao/SleepDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1878#2,3:58\n*S KotlinDebug\n*F\n+ 1 SleepDao.kt\ncom/sma/smartv3/db/dao/SleepDao\n*L\n38#1:58,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSleepDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDao.kt\ncom/sma/smartv3/db/dao/SleepDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1878#2,3:58\n*S KotlinDebug\n*F\n+ 1 SleepDao.kt\ncom/sma/smartv3/db/dao/SleepDao\n*L\n38#1:58,3\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic access$getTestSleeps$jd(Lcom/sma/smartv3/db/dao/SleepDao;JJ)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/SleepDao;->getTestSleeps(JJ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract deleteSleeps(JJ)V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM Sleep WHERE mTime >= :start AND mTime < :end"
    .end annotation
.end method

.method public abstract getListASC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Sleep WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSleeps(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Sleep WHERE mTime >= :start AND mTime < :end ORDER BY mTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;"
        }
    .end annotation
.end method

.method public getTestSleeps(JJ)Ljava/util/List;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/dao/TestData;->getTestSleeps()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-string v1, "sleep"

    invoke-static {v1}, Lcom/blankj/utilcode/util/ResourceUtils;->readAssets2String(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/db/dao/SleepDao$getTestSleeps$list$1;

    invoke-direct {v2}, Lcom/sma/smartv3/db/dao/SleepDao$getTestSleeps$list$1;-><init>()V

    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "fromJson(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    const v1, 0x2255100

    int-to-long v1, v1

    add-long/2addr p1, v1

    const v1, 0x112a880

    int-to-long v1, v1

    sub-long/2addr p3, v1

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-wide v3, p1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v5, Lcom/sma/smartv3/db/entity/Sleep;

    const v7, 0x493e0

    if-nez v2, :cond_1

    int-to-long v7, v7

    sub-long v7, p1, v7

    invoke-virtual {v5, v7, v8}, Lcom/sma/smartv3/db/entity/Sleep;->setMTime(J)V

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ne v2, v8, :cond_2

    int-to-long v7, v7

    add-long/2addr v7, p3

    invoke-virtual {v5, v7, v8}, Lcom/sma/smartv3/db/entity/Sleep;->setMTime(J)V

    goto :goto_1

    :cond_2
    invoke-virtual {v5, v3, v4}, Lcom/sma/smartv3/db/entity/Sleep;->setMTime(J)V

    const v2, 0x927c0

    int-to-long v7, v2

    add-long/2addr v3, v7

    :goto_1
    move v2, v6

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/dao/TestData;->getTestSleeps()Ljava/util/List;

    move-result-object p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    sget-object p1, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/dao/TestData;->getTestSleeps()Ljava/util/List;

    move-result-object p1

    return-object p1
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
            "Lcom/sma/smartv3/db/entity/Sleep;",
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
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;)I"
        }
    .end annotation
.end method
