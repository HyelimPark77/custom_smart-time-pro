.class public interface abstract Lcom/sma/smartv3/db/dao/MatchRecordDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/dao/MatchRecordDao$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMatchRecordDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchRecordDao.kt\ncom/sma/smartv3/db/dao/MatchRecordDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1869#2,2:75\n1869#2:77\n1869#2,2:78\n1869#2,2:80\n1870#2:82\n*S KotlinDebug\n*F\n+ 1 MatchRecordDao.kt\ncom/sma/smartv3/db/dao/MatchRecordDao\n*L\n17#1:75,2\n25#1:77\n27#1:78,2\n32#1:80,2\n25#1:82\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMatchRecordDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchRecordDao.kt\ncom/sma/smartv3/db/dao/MatchRecordDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1869#2,2:75\n1869#2:77\n1869#2,2:78\n1869#2,2:80\n1870#2:82\n*S KotlinDebug\n*F\n+ 1 MatchRecordDao.kt\ncom/sma/smartv3/db/dao/MatchRecordDao\n*L\n17#1:75,2\n25#1:77\n27#1:78,2\n32#1:80,2\n25#1:82\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic access$delete$jd(Lcom/sma/smartv3/db/dao/MatchRecordDao;I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->delete(I)V

    return-void
.end method

.method public static synthetic access$getMatchRecords$jd(Lcom/sma/smartv3/db/dao/MatchRecordDao;II)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->getMatchRecords(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$insert$jd(Lcom/sma/smartv3/db/dao/MatchRecordDao;Ljava/util/List;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->insert(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public abstract _deleteMatchLogById(I)V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM MatchLog WHERE mMatchRecordId = :matchRecordId"
    .end annotation
.end method

.method public abstract _deleteMatchPeriodById(I)V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM MatchPeriod WHERE mMatchRecordId = :matchRecordId"
    .end annotation
.end method

.method public abstract _deleteMatchRecordById(I)V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM MatchRecord WHERE mId = :id"
    .end annotation
.end method

.method public abstract _getMatchLogById(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM MatchLog WHERE mMatchRecordId = :matchRecordId"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;"
        }
    .end annotation
.end method

.method public abstract _getMatchPeriodsById(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM MatchPeriod WHERE mMatchRecordId = :matchRecordId"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;"
        }
    .end annotation
.end method

.method public abstract _getMatchRecords(II)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM MatchRecord WHERE  mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract _insertMatchLog(Ljava/util/List;)[J
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
            "Lcom/sma/smartv3/db/entity/MatchLog;",
            ">;)[J"
        }
    .end annotation
.end method

.method public abstract _insertMatchPeriod(Ljava/util/List;)[J
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
            "Lcom/sma/smartv3/db/entity/MatchPeriod;",
            ">;)[J"
        }
    .end annotation
.end method

.method public abstract _insertMatchRecord(Lcom/sma/smartv3/db/entity/MatchRecord;)J
    .param p1    # Lcom/sma/smartv3/db/entity/MatchRecord;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public delete(I)V
    .locals 0

    invoke-interface {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_deleteMatchLogById(I)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_deleteMatchPeriodById(I)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_deleteMatchRecordById(I)V

    return-void
.end method

.method public abstract getList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM MatchRecord WHERE mIsDelete != 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListBySource(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM MatchRecord WHERE mIsDelete != 1 AND mSource = :source"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation
.end method

.method public getMatchRecords(II)Ljava/util/List;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation

    invoke-interface {p0, p1, p2}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_getMatchRecords(II)Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/MatchRecord;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMId()I

    move-result v1

    invoke-interface {p0, v1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_getMatchPeriodsById(I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMPeriodList(Ljava/util/List;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMId()I

    move-result v1

    invoke-interface {p0, v1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_getMatchLogById(I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/MatchRecord;->setMLogList(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public insert(Ljava/util/List;)V
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/MatchRecord;

    invoke-interface {p0, v0}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_insertMatchRecord(Lcom/sma/smartv3/db/entity/MatchRecord;)J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMPeriodList()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/MatchPeriod;

    long-to-int v5, v1

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchPeriod;->setMMatchRecordId(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMPeriodList()Ljava/util/List;

    move-result-object v3

    invoke-interface {p0, v3}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_insertMatchPeriod(Ljava/util/List;)[J

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMLogList()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/MatchLog;

    long-to-int v5, v1

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/db/entity/MatchLog;->setMMatchRecordId(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/MatchRecord;->getMLogList()Ljava/util/List;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->_insertMatchLog(Ljava/util/List;)[J

    goto :goto_0

    :cond_2
    return-void
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
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;)I"
        }
    .end annotation
.end method
