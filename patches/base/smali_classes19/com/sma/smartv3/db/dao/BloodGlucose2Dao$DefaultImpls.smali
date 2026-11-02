.class public final Lcom/sma/smartv3/db/dao/BloodGlucose2Dao$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static getListForDay(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;)Ljava/util/List;
    .locals 0
    .param p0    # Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->access$getListForDay$jd(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static getListForDay(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;JJ)Ljava/util/List;
    .locals 0
    .param p0    # Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;",
            "JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->access$getListForDay$jd(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;JJ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static getTodayList(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;)Ljava/util/List;
    .locals 0
    .param p0    # Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->access$getTodayList$jd(Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
