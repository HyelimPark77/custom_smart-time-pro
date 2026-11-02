.class public final Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->analysis()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/BGEMResponse<",
        "Lcom/sma/smartv3/model/BGEMMeasurementData;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Ljava/lang/String;Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;->iO(Ljava/lang/String;Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    return-void
.end method

.method public static final iO(Ljava/lang/String;Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/BGEMManager;->OXO1:Lcom/sma/smartv3/biz/BGEMManager;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v1, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2$handleResponse$1$1;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/sma/smartv3/biz/BGEMManager;->O00(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Lcom/sma/smartv3/model/BGEMResponse;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/BGEMResponse<",
            "Lcom/sma/smartv3/model/BGEMMeasurementData;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BGEMResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/BGEMMeasurementData;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BGEMMeasurementData;->getMeasurement_id()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "measurementById handleResponse -> The measurement is complete and the results are waiting"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/i1OiI;

    invoke-direct {v2, p1, v1}, Lcom/android/mltcode/paycertificationapi/i1OiI;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x14

    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "analysis handleError -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->dismissLoading()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;->OXO1:Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;->access$showMessureFailedPopup(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/BGEMResponse;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity$analysis$2;->XIi00iiXO(Lcom/sma/smartv3/model/BGEMResponse;)V

    return-void
.end method
