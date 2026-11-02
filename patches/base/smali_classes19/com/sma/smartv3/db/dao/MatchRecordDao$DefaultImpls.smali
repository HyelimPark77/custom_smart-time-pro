.class public final Lcom/sma/smartv3/db/dao/MatchRecordDao$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/db/dao/MatchRecordDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static delete(Lcom/sma/smartv3/db/dao/MatchRecordDao;I)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/db/dao/MatchRecordDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->access$delete$jd(Lcom/sma/smartv3/db/dao/MatchRecordDao;I)V

    return-void
.end method

.method public static getMatchRecords(Lcom/sma/smartv3/db/dao/MatchRecordDao;II)Ljava/util/List;
    .locals 0
    .param p0    # Lcom/sma/smartv3/db/dao/MatchRecordDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/MatchRecordDao;",
            "II)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->access$getMatchRecords$jd(Lcom/sma/smartv3/db/dao/MatchRecordDao;II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static insert(Lcom/sma/smartv3/db/dao/MatchRecordDao;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/db/dao/MatchRecordDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/MatchRecordDao;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/MatchRecord;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/db/dao/MatchRecordDao;->access$insert$jd(Lcom/sma/smartv3/db/dao/MatchRecordDao;Ljava/util/List;)V

    return-void
.end method
