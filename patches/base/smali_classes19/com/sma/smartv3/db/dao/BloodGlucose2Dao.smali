.class public interface abstract Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/dao/BloodGlucose2Dao$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucose2Dao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Dao.kt\ncom/sma/smartv3/db/dao/BloodGlucose2Dao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,44:1\n1491#2:45\n1516#2,3:46\n1519#2,3:56\n1491#2:63\n1516#2,3:64\n1519#2,3:74\n382#3,7:49\n382#3,7:67\n126#4:59\n153#4,3:60\n126#4:77\n153#4,3:78\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Dao.kt\ncom/sma/smartv3/db/dao/BloodGlucose2Dao\n*L\n30#1:45\n30#1:46,3\n30#1:56,3\n36#1:63\n36#1:64,3\n36#1:74,3\n30#1:49,7\n36#1:67,7\n31#1:59\n31#1:60,3\n37#1:77\n37#1:78,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucose2Dao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Dao.kt\ncom/sma/smartv3/db/dao/BloodGlucose2Dao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,44:1\n1491#2:45\n1516#2,3:46\n1519#2,3:56\n1491#2:63\n1516#2,3:64\n1519#2,3:74\n382#3,7:49\n382#3,7:67\n126#4:59\n153#4,3:60\n126#4:77\n153#4,3:78\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Dao.kt\ncom/sma/smartv3/db/dao/BloodGlucose2Dao\n*L\n30#1:45\n30#1:46,3\n30#1:56,3\n36#1:63\n36#1:64,3\n36#1:74,3\n30#1:49,7\n36#1:67,7\n31#1:59\n31#1:60,3\n37#1:77\n37#1:78,3\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic access$getListForDay$jd(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getListForDay()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getListForDay$jd(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;JJ)Ljava/util/List;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getListForDay(JJ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getTodayList$jd(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;)Ljava/util/List;
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getTodayList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getList(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM BloodGlucose2 WHERE mTime >= :start AND mTime < :end AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListDESC()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListDESC(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM BloodGlucose2 WHERE mTime >= :start AND mTime < :end AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation
.end method

.method public getListForDay()Ljava/util/List;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 4
    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    .line 5
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiIOiX()Ljava/text/SimpleDateFormat;

    move-result-object v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    .line 7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 10
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 11
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 13
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    .line 14
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public getListForDay(JJ)Ljava/util/List;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation

    .line 15
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getList(JJ)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 16
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 18
    move-object p4, p3

    check-cast p4, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    .line 19
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiIOiX()Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {p4}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    .line 20
    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-interface {p2, p4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 24
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 27
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-static {p3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    .line 28
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public getTodayList()Ljava/util/List;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XiOIii1(Ljava/util/Calendar;)J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    add-long/2addr v2, v0

    invoke-interface {p0, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getList(JJ)Ljava/util/List;

    move-result-object v0

    return-object v0
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
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;)[J"
        }
    .end annotation
.end method
