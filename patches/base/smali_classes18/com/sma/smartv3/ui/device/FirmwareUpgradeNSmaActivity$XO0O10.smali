.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;
.super Lno/nordicsemi/android/dfu/DfuProgressListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-direct {p0}, Lno/nordicsemi/android/dfu/DfuProgressListenerAdapter;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    return-void
.end method


# virtual methods
.method public onDfuAborted(Ljava/lang/String;)V
    .locals 4

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140bf5

    invoke-static {p1, v3, v0, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "firmware_upgrade_failed"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method public onDfuCompleted(Ljava/lang/String;)V
    .locals 4

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "firmware_upgrade_failed"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiOI1Oi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OiOI1Oi;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    const p1, 0x7f14146f

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDfuProcessStarting(Ljava/lang/String;)V
    .locals 4

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const v2, 0x7f1412ba

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/String;IILjava/lang/String;)V
    .locals 1

    const-string p2, "deviceAddress"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 p3, 0x2

    const/4 p4, 0x0

    const v0, 0x7f140bf5

    invoke-static {p1, v0, p2, p3, p4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "firmware_upgrade_failed"

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method public onProgressChanged(Ljava/lang/String;IFFII)V
    .locals 0

    const-string p3, "deviceAddress"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    int-to-float p2, p2

    const/high16 p3, 0x42c80000    # 100.0f

    div-float/2addr p2, p3

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method
