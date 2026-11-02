.class public final Lcom/sma/smartv3/db/dao/ElectrocardiogramDao$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static getTestElectrocardiograms(Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;JJ)Ljava/util/List;
    .locals 0
    .param p0    # Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;",
            "JJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Electrocardiogram;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;->access$getTestElectrocardiograms$jd(Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;JJ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
