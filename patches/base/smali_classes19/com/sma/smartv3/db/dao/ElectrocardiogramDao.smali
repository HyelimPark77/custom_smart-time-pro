.class public interface abstract Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/dao/ElectrocardiogramDao$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nElectrocardiogramDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramDao.kt\ncom/sma/smartv3/db/dao/ElectrocardiogramDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1869#2,2:45\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramDao.kt\ncom/sma/smartv3/db/dao/ElectrocardiogramDao\n*L\n34#1:45,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nElectrocardiogramDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramDao.kt\ncom/sma/smartv3/db/dao/ElectrocardiogramDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1869#2,2:45\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramDao.kt\ncom/sma/smartv3/db/dao/ElectrocardiogramDao\n*L\n34#1:45,2\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic access$getTestElectrocardiograms$jd(Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;JJ)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;->getTestElectrocardiograms(JJ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getElectrocardiograms(JJ)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Electrocardiogram WHERE mTime >= :start AND mTime < :end AND mValue >= 50 AND mValue <= 220"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Electrocardiogram;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLastElectrocardiogram()Lcom/sma/smartv3/db/entity/Electrocardiogram;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM Electrocardiogram ORDER BY mId DESC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public getTestElectrocardiograms(JJ)Ljava/util/List;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Electrocardiogram;",
            ">;"
        }
    .end annotation

    sget-object p3, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p3}, Lcom/sma/smartv3/db/dao/TestData;->getTestElectrocardiograms()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    :try_start_0
    new-instance p3, Lcom/google/gson/Gson;

    invoke-direct {p3}, Lcom/google/gson/Gson;-><init>()V

    const-string p4, "ecg"

    invoke-static {p4}, Lcom/blankj/utilcode/util/ResourceUtils;->readAssets2String(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    new-instance v0, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao$getTestElectrocardiograms$list$1;

    invoke-direct {v0}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao$getTestElectrocardiograms$list$1;-><init>()V

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

    check-cast v0, Lcom/sma/smartv3/db/entity/Electrocardiogram;

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/db/entity/Electrocardiogram;->setMTime(J)V

    const v0, 0x36ee80

    int-to-long v0, v0

    add-long/2addr p1, v0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/dao/TestData;->getTestElectrocardiograms()Ljava/util/List;

    move-result-object p1

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p1, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    sget-object p1, Lcom/sma/smartv3/db/dao/TestData;->INSTANCE:Lcom/sma/smartv3/db/dao/TestData;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/dao/TestData;->getTestElectrocardiograms()Ljava/util/List;

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
            "Lcom/sma/smartv3/db/entity/Electrocardiogram;",
            ">;)[J"
        }
    .end annotation
.end method
