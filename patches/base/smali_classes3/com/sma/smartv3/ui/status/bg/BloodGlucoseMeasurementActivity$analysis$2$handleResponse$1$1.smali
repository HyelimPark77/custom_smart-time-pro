.class public final Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;->XIi00iiXO(Lcom/sma/smartv3/model/BGEMResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucoseMeasurementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n69#2,3:306\n72#2,5:310\n1#3:309\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1\n*L\n209#1:306,3\n209#1:310,5\n209#1:309\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucoseMeasurementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n69#2,3:306\n72#2,5:310\n1#3:309\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseMeasurementActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1\n*L\n209#1:306,3\n209#1:310,5\n209#1:309\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->dismissLoading()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;->toBloodGlucose2()Lcom/sma/smartv3/db/entity/BloodGlucose2;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "measurementById handleResponse -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLowerBound()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide v1

    cmpl-double v1, v1, v3

    if-lez v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    move-result-object v1

    filled-new-array {p1}, [Lcom/sma/smartv3/db/entity/BloodGlucose2;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->insert(Ljava/util/List;)[J

    const-string p1, "bloodglucose_change"

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->access$showMessureFailedPopup(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Failed to get measurement results"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->dismissLoading()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->access$showMessureFailedPopup(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;->OXO1(Lcom/sma/smartv3/model/BGEMRangeAnalysisResult;)V

    return-void
.end method
