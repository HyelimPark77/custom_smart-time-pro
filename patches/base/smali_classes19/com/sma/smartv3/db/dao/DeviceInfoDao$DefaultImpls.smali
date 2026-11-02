.class public final Lcom/sma/smartv3/db/dao/DeviceInfoDao$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/db/dao/DeviceInfoDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static setActiveDevice(Lcom/sma/smartv3/db/dao/DeviceInfoDao;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/db/dao/DeviceInfoDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Transaction;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->access$setActiveDevice$jd(Lcom/sma/smartv3/db/dao/DeviceInfoDao;Ljava/lang/String;)V

    return-void
.end method
